package sathish;
import java.sql.*;
public class create_table {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection a=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sathi","root","");
			Statement s=a.createStatement();
			s.execute("CREATE TABLE login (name VARCHAR(20) NULL , password VARCHAR(20) NULL , PRIMARY KEY (name))");
		}catch(Exception e)
		{ System.out.println(e);
		}  
	}
}
	