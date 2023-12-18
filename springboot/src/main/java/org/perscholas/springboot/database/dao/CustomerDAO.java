package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer,Long> {

    public Customer findById(Integer id);
//    @Query("Select c from Customer c where c.firstName = :firstName")
//    List<Customer> findByFirstName(String firstName);
       @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName OR c.lastName = :lastName")
       List<Customer> findByFirstNameOrLastName( String firstName,String lastName);

       @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName")
       List<Customer> findByFirstName(String firstName);

       @Query("SELECT c FROM Customer c WHERE c.lastName = :lastName")
       List<Customer> findByLastName(String lastName);
       //@Query("SELECT c FROM Customer c WHERE c.firstName LIKE :firstName AND c.lastName LIKE :lastName")
       //LIST<Customer>findByFnameAndLname(String firstName,String lastName);

       @Query("SELECT c FROM Customer c WHERE c.user.id = :userId")
       List<Customer> findByUserId(Integer userId);
}
