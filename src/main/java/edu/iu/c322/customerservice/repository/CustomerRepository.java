package edu.iu.c322.customerservice.repository;

import edu.iu.c322.customerservice.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    //Create Update Delete

    public List<Customer> findAll(){
        return customers;
    }

    public int create(Customer customer){
        int id = customers.size() + 1;
        customer.setId(id);
        customers.add(customer);

        return id;
    }

    public void update(Customer customer, int id){
        Customer temp = getCustomerById(id);
        if(temp != null){
            temp.setName(customer.getName());
            temp.setEmail(customer.getEmail());
        } else{
            throw new IllegalStateException("customer id is not valid.");
        }
    }

    public void delete(int id){
        Customer temp = getCustomerById(id);
        if(temp != null){
            customers.remove(temp);
        } else{
            throw new IllegalStateException("customer id is not valid.");
        }
    }

    private Customer getCustomerById(int id){
        return customers.stream().filter(temp -> temp.getId() == id).findAny().orElse(null);
    }
}
