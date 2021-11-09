package sathish;
import java.sql.*;
public class create_db {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection a=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306","root","");
			Statement s=a.createStatement();
			s.execute("Create database sathi");
			
			
			
		}catch(Exception e)
		{ System.out.println(e);
		}  
	}
}
		
	