package org.perscholas.database;

import org.perscholas.databae.dao.ProductDAO;
import org.perscholas.database.entity.Product;

public class HibernateProduct {
	public static void main(String[]args) {
		ProductDAO productDao = new ProductDAO();
		Product product = productDao.findById(5);
		System.out.println(product.getId() + " | " + product.getProductName());
		
	}

}
