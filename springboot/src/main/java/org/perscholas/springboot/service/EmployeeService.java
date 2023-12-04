package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDao;
    public void createEmployee(CreateEmployeeFormBean form){
        log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("Department: " + form.getDepartmentName());
        // if the form is null then is a create - if it is not null then it is edit
        //first we attempt to load it from the database(basically we assume that it is
        // if it was found in the database we know the incoming id was valid
        Employee employee = employeeDao.findById(form.getId());
        if (employee == null){
            employee = new Employee();
        }
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());
        employeeDao.save(employee);


    }
}

