package org.perscholas.database;


import org.perscholas.databae.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

 public class HibernateOrder {
	public static void main(String[] args) {
		OrderDAO OrderDao = new OrderDAO();
		Order order = OrderDao.findById(10100);
		System.out.println( order.getId() + " | " + order.getOrderDate() );
		//System.out.println(customer.getId() + " | " + customer.getCustomerName());
	}

}
