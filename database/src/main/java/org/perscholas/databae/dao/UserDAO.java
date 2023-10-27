package org.perscholas.databae.dao;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.User;

public class UserDAO {
	public User findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM User u WHERE u.id = ?1";
		TypedQuery<User> query = session.createQuery(hql, User.class);
		query.setParameter(1, id);
		User result = query.getSingleResult();
		return result;

	}

}
