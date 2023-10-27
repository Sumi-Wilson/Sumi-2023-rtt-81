package org.perscholas.database;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classic_models";
		String user = "root";
		String password = "password";
		Connection connection = null;

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Entre first name");

			String firstname = scanner.nextLine();
			System.out.println("Entre last name");
			String lastname = scanner.nextLine();
			// Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			connection = DriverManager.getConnection(dburl, user, password);

			// String sql = "Select * FROM employees where firstname = '" + firstname + "'";
			String sql = "Select * FROM employees where firstname = ? and lastname = ?";

			// Statement stmt = connection.createStatement();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				Integer id = result.getInt("id");
				String name = result.getString("firstname");
				String name1 = result.getString("lastname");
				String email = result.getString("email");
				System.out.println(id + "| " + name + " | " + name1 + " | " + email);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
	}
}
