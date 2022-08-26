package wk3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class mySQL {

	public void start() {
		
		String url = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "Waka#123196";
		
			try {
				// Load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
					// Connect to the db
					Connection connection = DriverManager.getConnection(url, user, pass);
					System.out.println("Connection is successful to db " + url + "\n");
					
					// OUTER JOIN not working in mySQL?	
					String query = "SELECT employee.*, department.location FROM userdb.employee CROSS JOIN userdb.department ON department.dept_name = employee.dept;";
					
					// Created a prepared statement (for non-leakage), it'll return one statement object
					PreparedStatement pstmt = connection.prepareStatement(query);
					
					ResultSet rs = pstmt.executeQuery();
					
					ResultSetMetaData  rsmd = rs.getMetaData(); 
					
					int columnsNumber = rsmd.getColumnCount();
					  
					while (rs.next()) {
						for (int i = 1; i <= columnsNumber; i++) {
					           
							if (i > 1) System.out.print(" | ");
							
					        String columnValue = rs.getString(i);
					        System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
					    };
					
						System.out.println("");
					};
									
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		};
		
	}
}
