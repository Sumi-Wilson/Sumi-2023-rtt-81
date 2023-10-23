package org.perscholas.database;

import org.perscholas.databae.dao.OrderDetailDAO;
import org.perscholas.database.entity.OrderDetail;

public class HibernateOrderDetail {
	public static void main(String[]args) {
		
		OrderDetailDAO orderDetailDao = new OrderDetailDAO();
		OrderDetail orderDetail = orderDetailDao.findById(4);
		System.out.println(orderDetail.getId() + " | " + orderDetail.getOrderId());
	}

}
