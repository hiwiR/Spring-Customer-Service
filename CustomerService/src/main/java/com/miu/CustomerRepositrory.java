package com.miu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.hibernate.cfg.Configuration;



@Repository
public class CustomerRepositrory  {

    private SessionFactory sessionFactory;

    public CustomerRepositrory(SessionFactory sessionFactory){
         this.sessionFactory = sessionFactory;
    }
    public void SaveCustomer(Customer customer){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
    }

}
