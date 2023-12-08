  package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetEmployees 
{
	public static void main(String[] args) throws Exception
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
			System.out.println("Connection is successful");
			
			Statement stmt = con.createStatement();	
			
			ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next()) //this will return true or false(whether next record is present or not)
				//rs will store all the records(rs is a container)
			{
				System.out.println("Employee no is "+rs.getInt(1)); //1st column
				System.out.println("Employee name is "+rs.getString(2)); //2nd column
				System.out.println("Employee salary is "+rs.getInt(3)); //3rd column
				System.out.println("===============================");
			}
			rs.close();
			stmt.close();
			con.close();
		}
		catch( ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
