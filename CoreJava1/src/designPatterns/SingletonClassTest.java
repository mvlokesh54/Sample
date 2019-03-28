package designPatterns;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;


public class SingletonClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Connection conn= SingletonClass.getConnection();
		 
		try {
			Statement  stat= conn.createStatement();
			String query="select * from emp ";
			ResultSet list =  stat.executeQuery(query);
			
			while(list.next())
			{
				System.out.println(list.getInt(1)+""+list.getString(2));
			}
			Connection conn1= SingletonClass.getConnection();
			conn.close();
			Connection conn2= SingletonClass.getConnection();
			System.out.println(conn);
			System.out.println(conn1);
			System.out.println(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("catch from test");
			e.printStackTrace();
		}

	}

}
