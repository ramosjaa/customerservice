package edu.iu.c322.customerservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GreetingController{

    //Get https:localhost:8080

    @GetMapping
    public String greetings(){
        return "Greetings!";
    }
}