package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.User;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.security.AuthenticatedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    private CustomerDAO customerDao;
    @Autowired
    private AuthenticatedUserService authenticatedUserService;

    public Customer createCustomer(CreateCustomerFormBean form) {
        log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getPhone());
        log.info("city: " + form.getCity());
        // if the form is null then is a create - if it is not null then it is edit
        //first we attempt to load it from the database(basically we assume that it is going to be an edit
        // if it was found in the database we know the incoming id was valid so we can edit it
        Customer customer = customerDao.findById(form.getId());
        //if the customer is null then we know that this is a create and we have to make a new oblect
        if (customer == null) {
            customer = new Customer();
            User user = authenticatedUserService.loadCurrentUser();
           // customer.setUserId(user.getId());
            customer.setUser(user);
        }
        //set the incoming values to be save to the database
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());
        //if want to put ur own images put them in the pub/images folder
        //when editing customer enter /pub/images/imagename.gif as ur image url in the database to display ur own image
        // altrernatively you can give full url of an image somewhere on the internet
        customer.setImageUrl(form.getImageUrl());

        return customerDao.save(customer);
    }
}


