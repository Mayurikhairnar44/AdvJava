package userinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestAccount2 
{
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root","password");
		System.out.println("Connection is successful");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a accbal no1 and no2");
		double accbal=sc.nextDouble();
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		
		String str="select * from account where accBal>? and accNo between ? and ?";
//		Statement stmt=con.createStatement();
		PreparedStatement ps=con.prepareStatement(str);
		ps.setDouble(1, accbal);
		ps.setInt(2, no1);
		ps.setInt(3, no2);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("Account no:"+rs.getInt(1));
			System.out.println("Account name:"+rs.getString(2));
			System.out.println("Account no:"+rs.getDouble(3));
			System.out.println("================================");
		}
	}
}
