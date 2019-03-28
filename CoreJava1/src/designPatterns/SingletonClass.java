package designPatterns;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonClass {

	/**
	 * @param args
	 */
	
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	static Connection conn = null;
	
	static Connection getConnection()
	{
		
		if(conn== null)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mysql");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("catch from singleton");
				e.printStackTrace();
			}
			
		}
		
		
		return conn;
	}

}
