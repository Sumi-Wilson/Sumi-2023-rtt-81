package org.perscholas.databae.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.Product;

public class ProductDAO {
	public Product findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM Product p WHERE p.id = ?1"; 
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter(1, id);
		Product result = query.getSingleResult();
		return result;
	}

}
