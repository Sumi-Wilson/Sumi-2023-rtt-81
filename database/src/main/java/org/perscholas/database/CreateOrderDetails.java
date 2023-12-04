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

// =========Home Work=================

public class CreateOrderDetails {

	private OrderDAO orderDao = new OrderDAO();
	private ProductDAO productDao = new ProductDAO();
	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();

	public void createOrderDetails() {
		System.out.println("Enter a product name: ");
		Scanner scanner = new Scanner(System.in);
		String productName = scanner.nextLine();

		List<Product> products = productDao.findByPartialName(productName);
		if (products.size() != 0) {
			for (Product product : products) {
				System.out.println(
						"Product id " + product.getId() + " | " + "Product Nmae " + " | " + product.getProductName());
			}

		} else {
			System.out.println("Product name entered is not valid");
			System.exit(0);
		}

		System.out.println("Enter a product id from the above result");
		Integer productId = scanner.nextInt();
		Product p = productDao.findById(productId);
		if (p == null) {
			System.out.println("You entered an invaild product ID:");
			System.exit(0);
		}

		System.out.println("Enter an order Number: ");
		Integer orderId = scanner.nextInt();
		Order o = orderDao.findById(orderId);

		/*
		 * if (o != null) { for (OrderDetail orderDetail : o.getOrderdetails()) { //
		 * System.out.println("order id " + orderDetail.getOrder().getId() + " = " + //
		 * orderId + " both are equal"); if (orderDetail.getProduct().getId() ==
		 * productId) { // ((orderDetail.getOrder().getId() == orderId) && //
		 * (orderDetail.getProduct().getId() == productId)
		 * System.out.println(orderDetail.getOrder().getId());
		 * System.out.println("product id " + orderDetail.getProduct().getId());
		 * System.out.println("You can not add a duplicate product"); System.exit(0); }
		 * 
		 * // System.out.println("product id " + orderDetail.getProduct().getId() +" " +
		 * // productId); // System.out.println("order id " +
		 * orderDetail.getOrder().getId() + " = " + // orderId);
		 * 
		 * }
		 * 
		 * OrderDetail od = new OrderDetail(); od.setProduct(p); od.setOrder(o);
		 * od.setOrder(o); od.setProduct(p); od.setQuantityOrdered(25);
		 * od.setPriceEach(20.25); od.setOrderLineNumber((short) 10);
		 * 
		 * orderDetailDao.save(od);
		 * 
		 * System.out.println("Successfully added product to order");
		 * 
		 * } else { System.out.println("You entered an invalid order ID:"); }
		 */

		OrderDetail od = orderDetailDao.findByOrderIdAndProductId(orderId, productId);
		if (od != null) {
			System.out.println("This product is already part of the order");
			System.out.println("Do you want to add more qyantity of the product: Y ,N");
			Character decision = scanner.next().charAt(0);
			if (decision == 'Y') {
				Integer quantity = od.getQuantityOrdered();
				System.out.println("How many more products you want to add:");
				Integer more = scanner.nextInt();
				more = quantity + 10;
				od.setQuantityOrdered(more);
				orderDetailDao.save(od);

			} else 
				System.exit(0);
		} else {

			OrderDetail od1 = new OrderDetail();
			od1.setProduct(p);
			od1.setOrder(o);
			//od1.setOrder(o);
			od1.setProduct(p);
			od1.setQuantityOrdered(25);
			od1.setPriceEach(20.25);
			od1.setOrderLineNumber((short) 10);

			orderDetailDao.save(od1);

			System.out.println("Successfully added product to order");
		}

	}

	public static void main(String[] args) {
		CreateOrderDetails cod = new CreateOrderDetails();
		cod.createOrderDetails();

	}

}
