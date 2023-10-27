package org.perscholas.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionExamplesHW {

	public static void main(String[] args) throws SQLException  {
		String url = "jdbc:mysql://localhost:3306/sql_sba";
		String uName = "root";
		String password = "password";
		Connection connection =null;
		try {
			 connection = DriverManager.getConnection(url,uName,password);
			 String sql = "select s.firstname as firstname,s.lastname as lastname,count(sc.courseId) as counts\r\n"
			 		+ " from student s,studentcourse sc,course c\r\n"
			 		+ " where s.id = sc.studentId\r\n"
			 		+ " and c.id = sc.courseId\r\n"
			 		+ " and c.deptId = s.majorId\r\n"
			 		+ " group by s.id \r\n"
			 		+ " order by counts desc,firstname asc,lastname asc;";
			 Statement stmt = connection.createStatement();
			 ResultSet result = stmt.executeQuery(sql);
			 while(result.next()) {
				 String firstname = result.getString("firstname");
				 String lastname = result.getString("lastname");
				 Integer count = result.getInt("counts");
				 System.out.println(firstname+" | " + lastname +" | " + count);
				 
			 }
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}


}
}