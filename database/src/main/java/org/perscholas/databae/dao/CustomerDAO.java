package org.perscholas.databae.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.TypeDef;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.CustomerName;

public class CustomerDAO {
	
	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 private Session session = factory.openSession();
	 
	public Customer findById(Integer id) {
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Session session = factory.openSession();

		String hql = "FROM Customer c WHERE c.id = :id"; 

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("id", id);
		try {
			Customer result = query.getSingleResult();
			return result;
		} catch (NoResultException nre) {
			return null;
		}

	}

	public List<Customer> findByFirstName(String fname) {
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Session session = factory.openSession();

		// Example of HQL to get all records of user class
		// SQL is : select * from customers c where c.contact_firstname = :firstname and
		// c.contact_lastname = :lastname
		String hql = "FROM Customer c WHERE c.contactFirstName = :firstname";

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("firstname", fname);

		List<Customer> result = query.getResultList();
		return result;
	}

	public void save(Customer save) {
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(save);
		t.commit();

	}

}
