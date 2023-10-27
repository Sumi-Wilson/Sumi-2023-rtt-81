package org.perscholas.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.perscholas.databae.dao.CustomerDAO;
import org.perscholas.databae.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class HibernateOrder {
	private CustomerDAO customerDao = new CustomerDAO();
	OrderDAO orderDao = new OrderDAO();

	// Order o = new Order();
	public static void main(String[] args) {
		HibernateOrder hc = new HibernateOrder();
		// Order o = new Order();
		System.out.println("enter a user id");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try {
			hc.createNewOrder(i);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hc.queryOrder();
		
	}

	public void queryOrder() {
		Order o = orderDao.findById(10100);
		Customer c = o.getCustomer();
	    System.out.println(	"Order " + o.getId() + " was made by customer " + c.getCustomerName() + " on " + o.getOrderDate());
		List<Order> orders = c.getOrders();
		for (Order order : orders) {
			System.out.println("Order " + order.getId());
		}

	}

	public void createNewOrder(int i) throws ParseException {
		// Order o = orderDao.findById(i);
		Customer c = customerDao.findById(i);
		if (c != null) {
			Order o = new Order();
			//o.setCustomerId(i);
			// when i want a customer to the order i need to customer object
			o.setCustomer(c);
			Date orderDate = new Date();
			o.setOrderDate(orderDate);
			//Date requiredDate = new Date();
			 SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
			Date requiredDate ;
			try {
				requiredDate = sdf.parse("2023-10-31");
				o.setRequiredDate(requiredDate);

				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			// Date requredDate = sdf.parse("2023-10-31");
			
			//o.setRequiredDate(requiredDate);
			o.setShippedDate(null);
			o.setStatus("pending");
			o.setComments("shipping needed");
			orderDao.save(o);
		} else {
			System.out.println("customer does not Exist");
		}

	}

}
