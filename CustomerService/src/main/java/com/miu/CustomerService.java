package com.miu;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();
}
