package com.miu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class CustomerServiceApplication implements Runnable{
    @Autowired
    private CustomerController customerController ;


    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        CustomerServiceApplication customerServiceApplication = applicationContext.getBean(CustomerServiceApplication.class);
        //DataSource dataSource = applicationContext.getBean(DataSource.class);
        customerServiceApplication.run();
    }

    @Override
    public void run() {
        customerController.getAllCustomer().forEach(customer -> System.out.print(customer.toString()));

    }
}
