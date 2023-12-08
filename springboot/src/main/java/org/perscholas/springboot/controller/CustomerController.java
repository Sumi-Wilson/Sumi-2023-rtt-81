package org.perscholas.springboot.controller;

import io.netty.util.internal.StringUtil;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDao;
    @Autowired
    private CustomerService customerService;
//     @GetMapping("/customer/delete/{customerId}")
//    public ModelAndView deleteCustomer(@PathVariable int customerId) {
//        ModelAndView response = new ModelAndView("customer/search");
//
//        Customer customer = customerDao.findById(customerId);
//
//        if ( customer != null ) {
//            customerDao.delete(customer);
//        } else {
//            log.warn("Customer with id " + customerId + " was not found") ;
//        }
//
//        return response;
//    }
    @GetMapping("/customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable int id,
                                     @RequestParam(required = false) String success){
        log.info(success);
        log.info("### in /customer/edit #####");
        ModelAndView response = new ModelAndView("customer/create");
        Customer customer = customerDao.findById(id);

        if (!StringUtils.isEmpty(success)){
            response.addObject("success",success);
        }
        CreateCustomerFormBean form = new CreateCustomerFormBean();

        if (customer != null){
            form.setId(customer.getId());
            form.setFirstName(customer.getFirstName());
            form.setLastName(customer.getLastName());
            form.setCity(customer.getCity());
            form.setPhone(customer.getPhone());
            form.setImageUrl(customer.getImageUrl());
        } else {
            log.warn("Customer with id " + id + "was not found");
        }
        response.addObject("form",form);
        return response;
    }
    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");

        log.info("In create customer with no args");

        return response;
    }

//    @GetMapping("/customer/search")
//    public ModelAndView search(@RequestParam(required = false)String search) {
//        ModelAndView response = new ModelAndView("customer/search");
//        log.debug("In the customer search controller method: " + search);
//        if (search != null) {
//            List<Customer> customers = customerDao.findByFirstName(search);
//            response.addObject("customers",customers);
//            response.addObject("search",search);
//            for(Customer customer : customers){
//                log.debug("customer: id = " + customer.getId() + " lastname = " + customer.getLastName());
//            }
//        }
//        return response;
//    }
    // Searching customer by first name or last name

    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName)
    {
        ModelAndView response = new ModelAndView("customer/search");
        log.debug("in the customer search controller method First Name:  " + firstName + " Last Name: " + lastName);
        if (firstName != null || lastName != null){
            List<Customer> customers;
            if (firstName != null && lastName != null ) {
                customers = customerDao.findByFirstNameOrLastName(firstName, lastName);

                //List<Customer> customers CustomerDao.findByFnameAndLname(firstName+"%",lastName+"%")

//            } else if (firstName != null) {
//                customers = customerDao.findByFirstName(firstName);
//            } else {
//                customers = customerDao.findByLastName(lastName);
//            }
                response.addObject("customers", customers);
                for (Customer customer : customers) {
                    log.debug("customer: Name = " + customer.getFirstName() + " lastname = " + customer.getLastName());
                }

            }
        }
        return response;
    }



        // the action attribute on the form tag is set to /customer/createSubmit so this method will be called when the user clicks the submit button
    @GetMapping("/customer/createSubmit")

      public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {
        log.info("$$$$$ in customer createSubmit $$$$$");
        if (bindingResult.hasErrors()) {
            log.info("######################### In create customer submit - has errors #########################");
            ModelAndView response = new ModelAndView("customer/create");

            for ( ObjectError error : bindingResult.getAllErrors() ) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }
        log.info("  in Create customer no error found");
        //ModelAndView response = new ModelAndView("customer/create");
        Customer c = customerService.createCustomer(form);
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");


//        log.info("firstName: " + form.getFirstName());
//        log.info("lastName: " + form.getLastName());
//        log.info("phone: " + form.getPhone());
//        log.info("city: " + form.getCity());

//        Customer customer = new Customer();
//        customer.setFirstName(form.getFirstName());
//        customer.setLastName(form.getLastName());
//        customer.setPhone(form.getPhone());
//        customer.setCity(form.getCity());
        //customerDao.save(customer);

        customerService.createCustomer(form);


        log.info("In create customer with incoming args");

        return response;
    }


}
