package org.perscholas.database;

import java.util.List;
import org.perscholas.databae.dao.CustomerNameDAO;
import org.perscholas.database.entity.CustomerName;

public class HibernateCustomerName {
	public static void main(String[] args) {
		CustomerNameDAO customerNameDao = new CustomerNameDAO();
		List<CustomerName> customers = customerNameDao.findByFirstName("Leslie");
		for (CustomerName c : customers) {
			System.out.println(c.getId() + " | " + c.getCustomerName() + " | " + c.getContactFirstName() + " | "
					+ c.getContactLastname());

		}

	}

}
