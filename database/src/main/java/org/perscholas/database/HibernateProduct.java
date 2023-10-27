package org.perscholas.database;

import java.text.ParseException;
import java.util.List;
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
	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();

	public static void main(String[] args) throws ParseException {

		HibernateProduct hp = new HibernateProduct();
//		System.out.println("enter a product id");
//		Scanner sc = new Scanner(System.in);
//		int productId = sc.nextInt();
		hp.createOrderDetails();

	}

	public void createOrderDetails() {

		// ask the user to enter a product name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a product name to add to your order:");
		String productName = scanner.nextLine();

		// looks up a product by a productName
		List<Product> products = productDao.findByName(productName);
		if (products.size() == 0) {
			System.out.println("You did not enter a valid  product name");
			System.exit(0);
		}
		// the query for product name can return more that one product with the same
		// name
		// so we list the products that were returned
		for (Product product : products) {
			System.out.println("Product id " + product.getId() + " | " + product.getProductName());
		}

		// of the list of of product names that we show let the user select the id that
		// they want to add
		System.out.println("Select a product Id:");
		Integer productId = scanner.nextInt();

		// the goal is to insert a record into the order details table
		Product p = productDao.findById(productId);

		// ask the user what order number they want to add the product too
		Order o = orderDao.findById(10100);

		// if the product is already part of the odrer do not add it again

		for (OrderDetail orderDetail : o.getOrderdetails()) {
			if (orderDetail.getProduct().getId() == productId) {
				// the product is already part of the order
				System.out.println(
						"The product " + p.getProductName() + " is already part of the order. can not add again");
				System.exit(1);
			}
		}
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
	}
}

//			Product p = productDao.findById(productId);
//			Order o = orderDao.findById(10100);
//			if (p != null) {
//				OrderDetail od = new OrderDetail();
//				od.setOrder(o);
//				od.setProduct(p);
//				od.setQuantityOrdered(25);
//				od.setPriceEach(20.25);
//				od.setOrderLineNumber((short)10);
//				CustomerDAO orderDetailsDAO;
//				CustomerDAO orderDetailDAO;
//				orderDetailDao.save(od);

//			}
//		
//			
//		
//	}
//
//}
