package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallableDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root", "password");
		System.out.println("connection is successful");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a increament value and accno");
		int incr=sc.nextInt();
		int accno=sc.nextInt();
		
		String str ="call update_proce(?, ?)";
		
		CallableStatement stmt= con.prepareCall(str);
		stmt.setInt(1, incr);
		stmt.setInt(2, accno);
		
		stmt.execute();
		System.out.println("Tha salary is incremented...");
	}
}
