package org.perscholas.databae.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class OrderDetailDAO {
	
	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 private Session session = factory.openSession();

	public OrderDetail findById(Integer id) {
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Session session = factory.openSession();
		String hql = "FROM OrderDetail o WHERE o.id = :orderid";
		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		query.setParameter("orderid", id);
		OrderDetail result = query.getSingleResult();
		return result;
	}

	public void save(OrderDetail orderDetail) {
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		//session.close();

	}
      public OrderDetail findByOrderIdAndProductId(Integer orderId, Integer productId) {
    	  //SessionFactory factory = new Configuration().configure().buildSessionFactory();
  		//Session session = factory.openSession();
  		String hql = "FROM OrderDetail o WHERE o.order.id = :orderid and o.product.id = :productid";
  		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
  		//Map<String, Object> parameters = new HashMap<>();
  		//parameters.put("orderid", orderId);
  		//parameters.put("productid", productId);
  		//query.setParameter("orderid" "productid", orderId,productId);
  		query.setParameter("orderid", orderId);
  		query.setParameter("productid", productId);
  		try {
			OrderDetail result = query.getSingleResult();
			return result;
		} catch (NoResultException nre) {
			return null;
		}

  		
  		
		
	}

}
