package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.perscholas.springboot.service.CustomerService;
import org.perscholas.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller

public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDao;
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employee/edit/{id}")
    public ModelAndView editCustomer(@PathVariable int id){
        ModelAndView response = new ModelAndView("employee/create");
        Employee employee = employeeDao.findById(id);
        CreateEmployeeFormBean form = new CreateEmployeeFormBean();
        if (employee != null){
            form.setId(employee.getId());
            form.setFirstName(employee.getFirstName());
            form.setLastName(employee.getLastName());
            form.setDepartmentName(employee.getDepartmentName());
        } else {
            log.warn("Customer with id " + id + "was not found");
        }
        response.addObject("form",form);
        return response;
    }
    @GetMapping("/employee/create")
    public ModelAndView createEmployee(){
        ModelAndView response = new ModelAndView("employee/create");
        log.info("In create employee with no args");
        return response;
    }
    @GetMapping("/employee/createSubmit")
    public ModelAndView createCustomerService(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("employee/create");

//        log.info("FirstName: " + form.getFirstName());
//        log.info("LastName: " + form.getLastName());
//        log.info("DepartmentName: " + form.getDepartmentName());

        employeeService.createEmployee(form);
        log.info("In create employee with incoming args");
        return response;

    }

     @GetMapping("/employee/search")
     public ModelAndView search(@RequestParam(required = false) String firstName,
                                @RequestParam(required = false) String lastName) {
         ModelAndView response = new ModelAndView("employee/search");
         log.debug("in the employee search controller method First Name:  " + firstName + " Last Name: " + lastName);
         if (firstName != null || lastName != null) {
             response.addObject("firstName", firstName);
             response.addObject("lastName", lastName);
             List<Employee> employees = employeeDao.findByFirstNameOrLastName(firstName, lastName);
             response.addObject("employees", employees);
             for (Employee employee : employees) {
                 log.debug("First Name = " + employee.getFirstName() + " last name = " + employee.getLastName());
             }
         }
         return response;
     }
//
//    @GetMapping("/customer/search")
//    public ModelAndView search(@RequestParam(required = false) String firstNameSearch,
//                               @RequestParam(required = false) String lastNameSearch) {
//        ModelAndView response = new ModelAndView("customer/search");
//
//        log.debug("in the customer search controller method : first name = " + firstNameSearch + " last name = " + lastNameSearch);
//
//        if (!StringUtils.isEmpty(firstNameSearch) || !StringUtils.isEmpty(lastNameSearch)) {
//
//            response.addObject("firstNameSearch", firstNameSearch);
//            response.addObject("lastNameSearch", lastNameSearch);
//
//            if (!StringUtils.isEmpty(firstNameSearch)) {
//                firstNameSearch = "%" + firstNameSearch + "%";
//            }
//
//            if (!StringUtils.isEmpty(lastNameSearch)) {
//                lastNameSearch = "%" + lastNameSearch + "%";
//            }
//
//            // we only want to do this code if the user has entered either a first name or a last name
//            List<Customer> customers = customerDao.findByFirstNameOrLastName(firstNameSearch, lastNameSearch);
//
//            response.addObject("customerVar", customers);
//
//
//            for (Customer customer : customers) {
//                log.debug("customer: id = " + customer.getId() + " last name = " + customer.getLastName());
//            }
//        }
//
//        return response;
//    }

}



