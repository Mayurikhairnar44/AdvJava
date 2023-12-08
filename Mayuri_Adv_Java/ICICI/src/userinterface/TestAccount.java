package userinterface;

import java.util.ArrayList;
import java.util.Scanner;
import entity.Account;
import validation.AccountValidation;
import Operation.Accountoperation;
import dao.AccountDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestAccount {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Account account1 = new Account();
		Account account2 = new Account(2, "Bhushan", 30000);
		AccountValidation accountValidation = new AccountValidation();
		Accountoperation accountoperation = new Accountoperation();
		AccountDao accountDao = new AccountDao();
		
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root","password");
		
		System.out.println("Connection is successful");
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Welcome to ICICI Bank..");
			System.out.println("\n1.accept details");
			System.out.println("2.display details");
			System.out.println("3.deposit amount");
			System.out.println("4.withdrow amount");
			System.out.println("5.Transfer amount");
			System.out.println("6.Update the account balance");
			System.out.println("7.Check the balance");
			System.out.println("8.Delete the account");
			System.out.println("9.Exit");
			System.out.println("Enter your choice:");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("1.accept details");
				System.out.println("Enter the account no ,name,acc balance : ");
				int accNo = sc.nextInt();
				String name = sc.next();
				double AccBal = sc.nextDouble();
				boolean result = accountValidation.checkAll(accNo, name, AccBal);
				if (result == true) {
					account1.setAccNo(accNo);
					account1.setAccHolderName(name);
					account1.setAccBal(AccBal);
					
					//insert the record in database : jdbc code
					accountDao.insertrecord(con, account1);
					System.out.println("Record added successfully");
					
				} else {
					System.out.println("Invalid inputs...");
				}
				System.out.println("========================================");
				break;

			case 2:
				System.out.println("2.display details");
				
				//accountDao.displayRecord1(con);
				
				ArrayList<Account> arrayList=new ArrayList<Account>();
				arrayList=accountDao.displayRecord2(con);
				for(int i=0;i<arrayList.size();i++)
				{
					System.out.println(arrayList.get(i));  
					System.out.println("====================================");
				}
				break;

			case 3:
				System.out.println("========================================");
				System.out.println("enter the depositing amount and account no");
				double amount = sc.nextDouble();
				int accNo1=sc.nextInt();
				if(accountoperation.Deposite(con, amount, accNo1))
				{
					System.out.println("Amount deposited");
				}
				else
				{
					System.out.println("There is an error");
				}
				break;
			case 4:
				System.out.println("========================================");
				System.out.println("enter the withdrawal amount and account no");
				double amount1 = sc.nextDouble();
				int accNo2=sc.nextInt();
				if(accountoperation.withdraw(con, amount1, accNo2))
				{
					System.out.println("Amount deposited");
				}
				else
				{
					System.out.println("There is an error");
				}
				break;
			case 5:
				System.out.println("========================================");
				System.out.println("5.Transfer amount");
				System.out.println("enter the amount to transfer");
				double amount2 = sc.nextDouble();
				System.out.println("Enter a account no 1 and account no 2");
				int accno1=sc.nextInt();
				int accno2=sc.nextInt();
				if (accountoperation.Transfer(con, amount2, accno1,accno2)) {
					System.out.println("successfully done...");
				} else
					System.out.println("there is some error...");
				System.out.println("========================================");
				break;
			case 6:
				System.out.println("Changing the account balance");
				System.out.println("Enter new bal and account no");
				double accbal=sc.nextDouble();
				int accno3=sc.nextInt();
				
				accountDao.updateRecord(con, accbal, accno3);
				System.out.println("successfully name changing done...");
				break;
			case 7:
				System.out.println("7.Check the balance");
				System.out.println("enter the account no 1 or 2 : ");
				int accno = sc.nextInt();
				if (accno == 1)
					System.out.println("new balance is for account 1 : " + account1.getAccBal());
				else if (accno == 2)
					System.out.println("new balance is for account 2 : " + account2.getAccBal());
				else
					System.out.println("there is some error...");
				System.out.println("========================================");       
				break;
			case 8:
				System.out.println("8.Deleting account");
				System.out.println("enter the account no: ");
				int accno4 = sc.nextInt();
				
				accountDao.deleteRecord(con, accno4);
				break;
			case 9:
				System.out.println("you are Exited...");
				System.exit(0);
			default:
				System.out.println("Wrong input.");
				break;

			}
			System.out.println("Do you want to cont press (Y/y)");
			choice = sc.next();
		} while (choice.equals("Y") || choice.equals("y"));
		System.out.println("Thanks for visiting");

	}

}
