package org.perscholas.databae.dao;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class OrderDetailDAO {
	public OrderDetail findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM OrderDetail o WHERE o.id = :orderid";
		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		query.setParameter("orderid", id);
		OrderDetail result = query.getSingleResult();
		return result;
	}
	public void save(OrderDetail orderDetail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		session.close();

	}

}
