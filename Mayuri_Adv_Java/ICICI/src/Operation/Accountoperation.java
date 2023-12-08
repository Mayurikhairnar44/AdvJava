package Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.AccountDao;
import entity.Account;

public class Accountoperation {
	double accBalance;

	public boolean Deposite(Connection con, double amt,int accno) {
		if (amt < 0) {
			System.out.println("invalid amount insert");
			return false;
		}  else {
			String str="update account set accBal=accBal+? where accNo=?";
			try
			{
				PreparedStatement ps = con.prepareStatement(str);
				
				ps.setDouble(1,amt);
				ps.setInt(2,accno);
				
				int i=ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Amount deposited done");
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
			return true;
		}
	}
	
	public boolean withdraw(Connection con, double amt, int accno) {
		if (amt < 0) {
			System.out.println("invalid amount insert");
			return false;
		} else {
			String str="update account set accBal=accBal-? where accNo=?";
			try
			{
				PreparedStatement ps = con.prepareStatement(str);
				
				ps.setDouble(1,amt);
				ps.setInt(2,accno);
				
				int i=ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Amount withdraw done");
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
			return true;
		}
	}

	public boolean Transfer(Connection con, double amt, int accno1,int accno2) {
		if (amt < 0) {
			System.out.println("invalid amount insert");
			return false;
		} else {
			String str="update account set accBal=accBal+? where accNo=?";
			String str1="update account set accBal=accBal-? where accNo=?";
			try
			{
				PreparedStatement ps = con.prepareStatement(str);
				PreparedStatement ps1 = con.prepareStatement(str1);
				
				ps.setDouble(1,amt);
				ps.setInt(2,accno2);
				
				ps1.setDouble(1, amt);
				ps1.setInt(2,accno1);
				
				int i=ps.executeUpdate();
				int j=ps1.executeUpdate();
				if(i>0 && j>0)
				{
					System.out.println("Amount Transfer done");
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
			System.out.println("Transfer is completed....");
			return true;
		}

	}

}
