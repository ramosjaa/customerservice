package edu.iu.c322.customerservice.controller;

import org.springframework.web.bind.annotation.*;

import edu.iu.c322.customerservice.model.Customer;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    //Get localhost:8080/customers
    @GetMapping
    public List<Customer> findAll(){
        return null;
    }

    @PostMapping
    public int create(@RequestBody Customer customer){
        return 0;
    }
}
