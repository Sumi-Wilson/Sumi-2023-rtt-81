package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

 @Slf4j
@Controller

public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDao;
    @GetMapping("/employee/create")
    public ModelAndView createEmployee(){
        ModelAndView response = new ModelAndView("employee/create");
        log.info("In create employee with no args");
        return response;
    }
    @GetMapping("/employee/createSubmit")
    public ModelAndView createCustomerService(CreateEmployeeFormBean form) {

        ModelAndView response = new ModelAndView("employee/create");

        log.info("FirstName: " + form.getFirstName());
        log.info("LastName: " + form.getLastName());
        log.info("DepartmentName: " + form.getDepartmentName());



        Employee employee = new Employee();
        employee.setFirst_name(form.getFirstName());
        employee.setLast_name(form.getLastName());
        employee.setDepartment_name(form.getDepartmentName());
        employeeDao.save(employee);
        log.info("In create employee with incoming args");
        return response;







    }



}



