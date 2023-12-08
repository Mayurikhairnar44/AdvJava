package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetDept 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root","password");
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("create table dept(deptno int primary key, dname varchar(20), loc varchar(20))");

		stmt.close();
		con.close();
		
	}
}
