package org.perscholas.database;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Scanner;

import org.perscholas.databae.dao.OrderDAO;
import org.perscholas.databae.dao.OrderDetailDAO;
import org.perscholas.databae.dao.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;



public class CreateOrderDetails {

	private OrderDAO orderDao = new OrderDAO();
	private ProductDAO productDao = new ProductDAO();
	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();
	
	public void createOrderDetails() {
		System.out.println("Enter a product name: ");
		Scanner scanner = new Scanner(System.in);
		String productName = scanner.nextLine();
		
		List<Product> products = productDao.findByPartialName(productName);
		if(products.size() != 0) {
			for(Product product : products) {
				System.out.println("Product id " + product.getId() + " | " + "Product Nmae " + " | " + product.getProductName());
			}
			
		}else {
			System.out.println("Product name entered is not valid");
			System.exit(0);
		}
		
		
		System.out.println("Enter an id from the above result");
		Integer productId = scanner.nextInt();
		Product p = productDao.findById(productId);
		
		System.out.println("Enter an order ID: ");
		Integer orderId = scanner.nextInt();
		Order o = orderDao.findById(orderId);
		if(o != null) {
			OrderDetail od = new OrderDetail();
			od.setProduct(p);
			od.setOrder(o);
			od.setOrder(o);
			od.setProduct(p);
			od.setQuantityOrdered(25);
			od.setPriceEach(20.25);
			od.setOrderLineNumber((short) 10);

			orderDetailDao.save(od);

			System.out.println("Successfully added product to order");
			
		}else {
			System.out.println("You entered an invalid order number");
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		CreateOrderDetails cod = new CreateOrderDetails();
		cod.createOrderDetails();	
		
		
	}
	
	
	
	
	
	
}
