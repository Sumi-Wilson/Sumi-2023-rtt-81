package org.perscholas.database;

import java.text.ParseException;
import java.util.Scanner;

import org.perscholas.databae.dao.CustomerDAO;
import org.perscholas.databae.dao.OrderDAO;
import org.perscholas.databae.dao.OrderDetailDAO;
import org.perscholas.databae.dao.ProductDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class HibernateProduct {
	private OrderDAO orderDao = new OrderDAO();
	private ProductDAO productDao = new ProductDAO();
	private CustomerDAO customerDao = new CustomerDAO();
	private OrderDetailDAO orderDetailDao  = new OrderDetailDAO();
	
	
	public static void main(String[]args) throws ParseException {
		
		HibernateProduct hp = new HibernateProduct();
		System.out.println("enter a product id");
		Scanner sc = new Scanner(System.in);
		int productId = sc.nextInt();
		hp.createOrderDetails(productId);
		
	}
	public void createOrderDetails(int productId) {
		
			Product p = productDao.findById(productId);
			Order o = orderDao.findById(10100);
			if (p != null) {
				OrderDetail od = new OrderDetail();
				od.setOrder(o);
				od.setProduct(p);
				od.setQuantityOrdered(25);
				od.setPriceEach(20.25);
				od.setOrderLineNumber((short)10);
				CustomerDAO orderDetailsDAO;
				CustomerDAO orderDetailDAO;
				orderDetailDao.save(od);
				
			}
		
			
		
	}

}
