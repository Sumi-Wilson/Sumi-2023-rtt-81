package org.perscholas.database;

import java.util.List;

import org.perscholas.databae.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class CreateAndUpdateExample {
	private CustomerDAO customerDao = new CustomerDAO();

	public void insertCustomerExample() {
		Customer c = new Customer();
		c.setCustomerName("Series Reminder");
		c.setContactFirstName("Sumi");
		c.setContactLastname("Wilson");
		c.setAddressLine1("Address Line 1");
		c.setAddressLine2("Address Line 1");
		c.setCity("Austin");
		c.setState("Texas");
		c.setPostalCode("78751");
		c.setCountry("USA");
		c.setCreditLimit(10000.00);
		c.setPhone("555-555-1234");
		customerDao.save(c);
		
	}
    public void updateCustomerUpdate() {
    	Customer c = customerDao.findById(103);
    	if(c != null ) {
    	   System.out.println("Customer Name:" + c.getCustomerName());
    	   c.setContactFirstName("updated first name");
    	   c.setContactLastname("updated last name");
    	   customerDao.save(c);
    	}else {
    		System.out.println("customer does not exist");
    	}
		
	}
    public void listQuery() {
    	List<Customer> customers = customerDao.findByFirstName(null);
    	System.out.println("we found " + customers.size() + " records in datebase");
    }

	public static void main(String[] args) {
		CreateAndUpdateExample caue = new CreateAndUpdateExample();
		//caue.insertCustomerExample();
		//caue.updateCustomerUpdate();
		//caue.
		caue.listQuery();

	}

}
