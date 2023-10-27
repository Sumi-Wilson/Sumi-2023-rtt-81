package org.perscholas.database;

import org.perscholas.databae.dao.UserDAO;
import org.perscholas.database.entity.User;

public class HibernateUser {
	public static void main(String[] args) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(5);
		System.out.println(user.getId() + " | " + user.getEmail());

	}
}
