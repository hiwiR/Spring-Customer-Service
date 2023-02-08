package com.miu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;


    @GetMapping()
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();

    }



}
