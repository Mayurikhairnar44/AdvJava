package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.Account;

public class AccountDao 
{
	public void insertrecord(Connection con, Account account)
	{
		String str="insert into account values(?,?,?)";
		try
		{
			PreparedStatement ps = con.prepareStatement(str);
			
			ps.setInt(1,account.getAccNo());
			ps.setString(2, account.getAccHolderName());
			ps.setDouble(3, account.getAccBal( ));
			
			
			int i=ps.executeUpdate();
			if(i>=0)
			{
				System.out.println("Record inserted");
			}
			else
			{
				System.out.println("There is an error");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateRecord(Connection con, double incr, int accno)
	{
		String str="update account set accBal=accBal+? where accNo=?";
		try
		{
			PreparedStatement ps = con.prepareStatement(str);
			
			ps.setDouble(1,incr);
			ps.setInt(2,accno);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record inserted");
			}
			else
			{
				System.out.println("There is an error");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void displayRecord(Connection con)
	{
		//String str="select * from account";
		try
		{
			Statement stmt = con.createStatement();	
			ResultSet rs=stmt.executeQuery("select * from account");
			while(rs.next())
			{
				System.out.println("Account no is "+rs.getInt(1)); //1st column
				System.out.println("Account holder name is "+rs.getString(2)); //2nd column
				System.out.println("Salary is "+rs.getDouble(3)); //3rd column
				System.out.println("===============================");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Account> displayRecord2(Connection con)
	{
		ArrayList<Account> arrAccount=new ArrayList<Account>();
		Statement stmt=null;
		try
		{
			stmt = con.createStatement();	
			ResultSet rs=stmt.executeQuery("select * from account");
			while(rs.next())
			{
				int accNo=rs.getInt(1);
				String name=rs.getString(2);
				double accbal=rs.getDouble(3);
				
				Account account=new Account();
				
				account.setAccNo(accNo);
				account.setAccHolderName(name);
				account.setAccBal(accbal);
				
				//using constructor
//				Account account=new Account(accNo, name, accbal);
				
				arrAccount.add(account);
				
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return arrAccount;
	}
	public void deleteRecord(Connection con, int accno)
	{
		String str="delete from account where accNo=?";
		try
		{
			PreparedStatement ps = con.prepareStatement(str);
			
			ps.setDouble(1,accno);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record deleted");
			}
			else
			{
				System.out.println("There is an error");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
