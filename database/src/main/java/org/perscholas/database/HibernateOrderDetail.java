package org.perscholas.database;

import java.util.List;

import org.perscholas.databae.dao.OrderDetailDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;

public class HibernateOrderDetail {
	  static OrderDetailDAO orderDetailDao = new OrderDetailDAO();
	public static void main(String[]args) {
		HibernateOrderDetail hoc = new HibernateOrderDetail();
		//OrderDetailDAO orderDetailDao = new OrderDetailDAO();
		OrderDetail orderDetail = orderDetailDao.findById(4);
		System.out.println(orderDetail.getId() + " | " + orderDetail.getProduct());
		hoc.queryOrderDetail();
		
	}
	public void queryOrderDetail() {
		OrderDetail od = orderDetailDao.findById(5);
		Order o = od.getOrder();
		System.out.println("customer with customer id  "+ o.getCustomer() +" with orderdetail id " + od.getId()+ " has ordered the product with id " +
		o.getId()+ " of quantity " + od.getQuantityOrdered()+ " with unit price " + od.getPriceEach());
		List<OrderDetail> orderDetails = o.getOrderdetails();
		for(OrderDetail orderdetail :orderDetails) {
			System.out.println("orderdetail id " + orderdetail.getId() + " order id " + orderdetail.getOrder()
			+ " quantity orderd  " + orderdetail.getQuantityOrdered() + " unit price  " + orderdetail.getPriceEach());
		}
		
	}
   
}
