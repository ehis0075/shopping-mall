package com.market.app.shoppingmall.repository.handlers;

import com.market.app.shoppingmall.models.Customer;
import com.market.app.shoppingmall.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolationException;
import java.util.HashSet;

// to handle the spring data call-backs

@Component // to load this class as a spring bean in the spring context
@RepositoryEventHandler  // tells spring data rest that this class will listen to event when entity are saved, added or deleted
public class CustomerEventHandler {

    @Autowired
    private CustomerRepository customerRepository;

    @HandleBeforeCreate
    public void handleCustomerCreate(Customer c){

        // we want to enforce unique customer full name
        Customer newCustomer = customerRepository.findCustomerByFullName(c.getFullName());
        if(newCustomer != null){
            System.out.println("full name needs to be unique");
            throw new ConstraintViolationException("full name needs to be unique", new HashSet<>());

        }
    }

}
