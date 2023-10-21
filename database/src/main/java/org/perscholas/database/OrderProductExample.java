package org.perscholas.database;

import java.sql.*;
import java.util.Scanner;

public class OrderProductExample {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classic_models";
		String user = "root";
		String password = "password";
		Connection connection = null;

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Entre the order number");

			String id = scanner.next();
			
			// Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			connection = DriverManager.getConnection(dburl, user, password);

			// String sql = "Select * FROM employees where firstname = '" + firstname + "'";
			//String sql = "Select * FROM employees where firstname = ? and lastname = ?";
			String sql="select p.id, p.product_name, od.quantity_ordered,p.msrp, p.buy_price,\r\n"
					+ "    (p.msrp-p.buy_price) as margin,((p.msrp-buy_price)* od.quantity_ordered)\r\n"
					+ "    as 'total_margin'\r\n"
					+ "    from products p,orderdetails od\r\n"
					+ "    where p.id =od.product_id\r\n"
					+ "    and od.order_id = ?;";
					

			// Statement stmt = connection.createStatement();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, id);
			//stmt.setString(2, lastname);
			ResultSet result = stmt.executeQuery();
            double totalMarginOfAllOrder = 0;
			while (result.next()) {
				Integer id1 = result.getInt("id");
				String name = result.getString("product_name");
				Integer quantity_ordered = result.getInt("quantity_ordered");
				Double msrp = result.getDouble("msrp");
				Double buy_price = result.getDouble("buy_price");
				Double margin = result.getDouble("margin");
				Double total_margin = result.getDouble("total_margin");
				System.out.println(id1 +"\t"+ name+"\t"  + "\t" + quantity_ordered + "\t" 
						+ msrp + "\t" + buy_price + "\t" + margin +
						"\t" + total_margin);
				totalMarginOfAllOrder =(double)total_margin+totalMarginOfAllOrder;
			}
			System.out.printf("\n Total margin for all order:%.2f",totalMarginOfAllOrder);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
	}
}
