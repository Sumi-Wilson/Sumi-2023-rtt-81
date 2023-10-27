package org.perscholas.database;
import java.sql.*;
import java.util.Scanner;
public class FirstConnection {
	
		public static void main(String[] args) throws SQLException {
			   String dburl = "jdbc:mysql://localhost:3306/classic_models";
			   String user = "root";
			   String password = "password";
			   Connection connection = null;;
			   try {
				   Scanner scanner = new Scanner(System.in);
				   System.out.println("Entre first name");
				   String firstname = scanner.nextLine();
				 //Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			       connection = DriverManager.getConnection(dburl, user, password);
			      String sql = "Select * FROM employees where firstname = '" + firstname + "'";
			      Statement stmt = connection.createStatement();
			      ResultSet result =  stmt.executeQuery(sql);
			      
			      while(result.next())
			 	 {
			     Integer id = result.getInt("id");
			 	 String name = result.getString("firstName");
			 	 String email = result.getString("email");
			 	 System.out.println(id+ "| "+name +" | " + email);   
			  }
			      


			   }
			   catch(SQLException e) {
			       e.printStackTrace();
			   }
			   finally {
				   
			   }
			}
	}
	

