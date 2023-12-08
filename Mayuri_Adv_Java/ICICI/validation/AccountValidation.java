package validation;

public class AccountValidation {
	public boolean checkName(String accHolderName) {
		char ch = ' ';
		boolean validName = false;
		for (int i = 0; i < accHolderName.length(); i++) {
			ch = accHolderName.charAt(i);
			if ((ch >= 65 && ch <= 90) || (ch > 96 && ch <= 122)) {
				validName = true;
			} else {
				validName = false;
				break;
			}
		}
		if (validName == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkAll(int accNo, String accHolderName, double bal) {
		if (accNo < 0) {
			System.out.println("Account no can't be negative");
			return false;
		}
		if (checkName(accHolderName) == false) {
			System.out.println("Invalid Name");
			return false;
		}
		if (bal > 50000) {
			System.out.println("Produce the documents...");
			return false;
		} else {
			System.out.println("All the input is valid ");
			return true;
		}
	}
}
