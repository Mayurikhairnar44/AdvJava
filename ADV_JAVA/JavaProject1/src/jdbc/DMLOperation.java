package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DMLOperation 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root","password");
		System.out.println("Connection is successful");
		Statement stmt = con.createStatement();
		
		//insert the record
//		String str="insert into dept values(40,'sales','bang')";
//		int i=stmt.executeUpdate(str);
//		if(i>=0)
//		{
//			System.out.println("i is "+i);
//			System.out.println("Inserted record successfully...");
//		}
//		else
//		{
//			System.out.println("There is an error");
//		}
		
		//update the record
//		String str="update dept set loc='nashik' where deptno=40";
//		int i = stmt.executeUpdate(str);
//		if(i>=0)
//		{
//			System.out.println("Record updated successfully");
//		}
//		else
//		{
//			System.err.println("There is an error");
//		}
		
		//delete the record
		String str="delete from dept where deptno=40";
		int i= stmt.executeUpdate(str);
		if(i>=0)
		{
			System.out.println("record deleted successfully");
		}
		else
		{
			System.out.println("There is an error");
		}
		stmt.close();
		con.close();
	}
}
