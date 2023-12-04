package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    private CustomerDAO customerDao;
    public void createCustomer(CreateCustomerFormBean form){
        log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getPhone());
        log.info("city: " + form.getCity());
        // if the form is null then is a create - if it is not null then it is edit
        //first we attempt to load it from the database(basically we assume that it is
        // if it was found in the database we know the incoming id was valid
        Customer customer = customerDao.findById(form.getId());
        if (customer == null){
            customer = new Customer();
        }


       customer.setFirstName(form.getFirstName());
       customer.setLastName(form.getLastName());
       customer.setPhone(form.getPhone());
       customer.setCity(form.getCity());
       customerDao.save(customer);

    }
}
