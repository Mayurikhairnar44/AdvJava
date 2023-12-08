package userinterface;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestAccount3 
{
	public static void main(String[] args) throws Exception  
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
		System.out.println("connection is successful");
	}
}
