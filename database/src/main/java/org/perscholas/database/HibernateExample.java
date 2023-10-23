package org.perscholas.database;

import org.perscholas.databae.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		
		Customer customer = customerDao.findById(103);
		
		System.out.println( customer.getId() + " | " + customer.getCustomerName() );
		//System.out.println(customer.getId() + " | " + customer.getCustomerName());
	}
}
