package sathish;
import java.sql.*;
public class db_1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection a=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306","root","");
			Statement s=a.createStatement();
			ResultSet r=s.executeQuery("show databases");
			while(r.next()) {
				System.out.println(r.getString(1));
			}
			a.close();
		}
			catch(Exception e)
			{ System.out.println(e);
			}  
			
		}

	}

