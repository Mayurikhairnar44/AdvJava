package userinterface;

import java.util.Scanner;
import entity.Account;
import validation.AccountValidation;
import Operation.Accountoperation;

public class TestAccount {

	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account(2, "Bhushan", 30000);
		AccountValidation accountValidation = new AccountValidation();
		Accountoperation accountoperation = new Accountoperation();
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Welcome to ICICI Bank..");
			System.out.println("\n1.accept details");
			System.out.println("2.display details");
			System.out.println("3.deposit amount");
			System.out.println("4.withdrow amount");
			System.out.println("5.Transfer amount");
			System.out.println("6.Change the Name");
			System.out.println("7.Check the balance");
			System.out.println("8.Exit");
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
					System.out.println("Account is created");
				} else {
					System.out.println("Invalid inputs...");
				}
				System.out.println("========================================");
				break;

			case 2:
				System.out.println("========================================");
				System.out.println("2.display details");
				System.out.println("accno is " + account1.getAccNo() + "\naccHolderName" + account1.getAccHolderName()
						+ "\naccount BAlance :" + account1.getAccBal());
				System.out.println("========================================");
				break;

			case 3:
				System.out.println("========================================");
				System.out.println("enter the depositing amount");
				double amount = sc.nextDouble();
				boolean result1 = accountoperation.Deposite(account2, amount);
				if (result1 == true) {
					System.out.println("depositing successfully done...");
					System.out.println("new balance is " + account2.getAccBal());
				} else
					System.out.println("there is some error...");
				System.out.println("========================================");
				break;
			case 4:
				System.out.println("========================================");
				System.out.println("enter the depositing amount");
				double amount1 = sc.nextDouble();
				boolean result2 = accountoperation.withdraw(account2, amount1);
				if (result2 == true) {
					System.out.println("depositing successfully done...");
					System.out.println("new balance is " + account2.getAccBal());
				} else
					System.out.println("there is some error...");
				System.out.println("========================================");
				break;
			case 5:
				System.out.println("========================================");
				System.out.println("5.Transfer amount");
				System.out.println("enter the amount to transfer");
				double amount2 = sc.nextDouble();
				boolean result3 = accountoperation.Transfer(account1, account2, amount2);
				if (result3 == true) {
					System.out.println("successfully done...");
					System.out.println("new balance is for account 1 : " + account1.getAccBal());
					System.out.println("new balance is for account 2 : " + account2.getAccBal());
				} else
					System.out.println("there is some error...");
				System.out.println("========================================");
				break;
			case 6:
				System.out.println("Changing the Name");
				System.out.println("Enter new name");
				String name1 = sc.next();
				boolean result4 = accountValidation.checkName(name1);
				if (result4 == true) {
					account2.setAccHolderName(name1);
					System.out.println("successfully name changing done...");
					System.out.println("new name is for account 2 is : " + account2.getAccHolderName());
				} else
					System.out.println("there is some error...");
				System.out.println("========================================");
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
