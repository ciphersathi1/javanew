package sathish;
import java.sql.*;
public class insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection a=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sathi","root","");
			Statement s=a.createStatement();
			String sql="INSERT INTO login (name, password) "+"VALUES ('celciya','p2k@123')";
			s.executeUpdate(sql);
		}catch(Exception e)
		{ System.out.println(e);
		}  
	}
}
	