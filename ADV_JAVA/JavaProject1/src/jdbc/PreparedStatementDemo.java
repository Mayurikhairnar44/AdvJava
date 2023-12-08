package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class PreparedStatementDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root","password");
		
		System.out.println("Connection is successful");
		
		Scanner sc=new Scanner(System.in);
		//insert
//		System.out.println("Enter a emp no, name and sal");
//		int empno=sc.nextInt();
//		String name=sc.next();
//		double sal=sc.nextDouble();
//		
//		String str = "insert into emp values(?,?,?)"; //?->placeholders
//		
//		PreparedStatement ps = con.prepareStatement(str);
//		
//		ps.setInt(1,empno);
//		ps.setString(2, name);
//		ps.setDouble(3, sal);
//		
//		int i=ps.executeUpdate();
//		if(i>=0)
//		{
//			System.out.println("Record inserted");
//		}
//		else
//		{
//			System.out.println("There is an error");
//		}
		
		//update
//		System.out.println("Enter a increment");
//		double incr=sc.nextDouble();
//		System.out.println("Enter a emp name");
//		String name=sc.next();
//		
//		String str = "update emp set sal = sal+? where ename=?";
//		
//		PreparedStatement ps = con.prepareStatement(str);
//		
//		ps.setDouble(1,incr);
//		ps.setString(2, name);
//		int i=ps.executeUpdate();
//		if(i > 0)
//		{
//			System.out.println("Record updated successfully");
//		}
//		else
//		{
//			System.out.println("There is an error");
//		}
		
		
		//delete
		System.out.println("Enter a emp no");
		int empno=sc.nextInt();
		
		String str = "delete from emp where empno=?";
		
		PreparedStatement ps = con.prepareStatement(str);
		
		ps.setInt(1,empno);
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Record deleted successfully");
		}
		else
		{
			System.out.println("There is an error");
		}
		
		con.close();
		ps.close();
		sc.close();
		
	}
}
