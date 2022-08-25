package wk3;

import java.sql.DriverManager;
import java.sql.SQLException;

public class mySQL {

	public void start() {
		
		String url = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "Waka#123196";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				DriverManager.getConnection(url, user ,pass);
				System.out.println("Connection is successful to db " + url);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
