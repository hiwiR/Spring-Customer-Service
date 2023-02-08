package com.miu.configuration;

import com.miu.Address;
import com.miu.Customer;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
//import org.hibernate.cfg.Configuration;

@Configuration
public class HibernateConfiguration {

    private static SessionFactory sessionFactory;
    @Bean
    public SessionFactory sessionFactory(){
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.configure(Repository.class.getResource("/hibernate.cfg.xml"));

        sessionFactory = configuration.addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Address.class)
                .buildSessionFactory();
        return sessionFactory;
    }
}
