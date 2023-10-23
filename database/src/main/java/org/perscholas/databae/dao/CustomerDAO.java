package org.perscholas.databae.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.TypeDef;
import org.perscholas.database.entity.Customer;

;

public class CustomerDAO {
	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer c WHERE c.id = ?1"; // Example of HQL to get all records of user class

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter(1, id);

		Customer result = query.getSingleResult();
		return result;
	}

}
