package Operation;

import entity.Account;

public class Accountoperation {
	double accBalance;

	public boolean withdraw(Account account, double amt) {
		if (amt < 0) {
			System.out.println("invalid amount insert");
			return false;
		} else if (amt > account.getAccBal()) {
			System.out.println("insufficent balance");
			return false;
		} else {
			accBalance = account.getAccBal() - amt;
			account.setAccBal(accBalance);
			System.out.println("amount is withdrawal");
			return true;
		}
	}

	public boolean Deposite(Account account, double amt) {
		if (amt < 0) {
			System.out.println("invalid amount insert");
			return false;
		} else {
			accBalance = account.getAccBal() + amt;
			account.setAccBal(accBalance);
			System.out.println("amount is Deposite");
			return true;
		}
	}

	public boolean Transfer(Account account1, Account account2, double amt) {
		if (amt < 0) {
			System.out.println("invalid amount insert");
			return false;
		} else if (amt > account1.getAccBal()) {
			System.out.println("Not enough balance");
			return false;
		} else {
			accBalance = account1.getAccBal() - amt;
			account1.setAccBal(accBalance);
			double balance = account2.getAccBal();
			double newBalance = balance + amt;
			account2.setAccBal(newBalance);

			System.out.println("Transfer is completed....");
			return true;
		}

	}

}
