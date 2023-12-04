package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee,Long> {
    Employee findById(Integer id);
    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName OR e.lastName = :lastName")
    List<Employee> findByFirstNameOrLastName(String firstName, String lastName);
}
