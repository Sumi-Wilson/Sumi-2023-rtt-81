package org.perscholas.databae.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.CustomerName;

public class CustomerNameDAO {
	public List<CustomerName> findByFirstName(String fname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Example of HQL to get all records of user class
		// SQL is : select * from customers c where c.contact_firstname = :firstname and c.contact_lastname = :lastname
		String hql = "FROM CustomerName c WHERE c.contactFirstName = :firstname"; 
		
		TypedQuery<CustomerName> query = session.createQuery(hql, CustomerName.class);
		query.setParameter("firstname",fname);
		
		List<CustomerName> result = query.getResultList();
		return result;
	}

}
