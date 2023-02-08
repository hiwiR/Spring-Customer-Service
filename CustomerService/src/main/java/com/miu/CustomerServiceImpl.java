package com.miu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepositrory customerRepositrory;

    @Override
    public List<Customer> getAllCustomer() {
        customerRepositrory.SaveCustomer(new Customer(3L,"Mariyam","Selemon",new Address(3L,52557)));
        return Arrays.asList(new Customer(1L,"Mariyam","Selemon",new Address(1L,52557)),
                new Customer(2L,"Selam","Mekonen",new Address(1L,52557)),
                new Customer(3L,"Mergitu","Bekana",new Address(1L,52557))
        );
    }
}
