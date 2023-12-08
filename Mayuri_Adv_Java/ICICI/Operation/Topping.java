package Operation;

import java.util.Scanner;

import entity.Bill;

class Cheese {

}

public class Topping {
	Scanner sc = new Scanner(System.in);
	int ch, a;
	Bill bill = new Bill();

	public void set() {
		System.out.println("Enter your choice : ");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			do {
				System.out.println("Enter your choice : ");
				a = sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("Extra mushroom is added ");
					bill.setTvprice(60.0f);
					break;
				case 2:
					System.out.println("Extra Green Olive is added ");
					bill.setTvprice(60.0f);
					break;
				case 3:
					System.out.println("Extra Black Olive is added ");
					bill.setTvprice(60.0f);
					break;
				case 4:
					System.out.println("Extra Tomato is added ");
					bill.setTvprice(60.0f);
					break;
				case 5:
					System.out.println("Extra Onion is added ");
					bill.setTvprice(60.0f);
					break;
				case 6:
					System.out.println("Extra Paneer is added ");
					bill.setTvprice(60.0f);
					break;
				case 7:
					System.out.println("Extra Capsicum is added");
					bill.setTvprice(60.0f);
				case 8:
					System.out.println("You are on back menu");
					break;
				case 0:
					System.out.println("You are Exited");
					break;
				}
			} while (a != 0);
			break;
		case 2:
			System.out.println("Enter your choice : ");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Extra Periperi chicken is added ");
				bill.setTnprice(75.0f);
				break;
			case 2:
				System.out.println("Extra Pepper barbeque Chicken is added ");
				bill.setTnprice(75.0f);
				break;
			case 3:
				System.out.println("Extra Chicken Pepper is added ");
				bill.setTnprice(75.0f);
				break;
			case 4:
				System.out.println("Extra Chicken Tikka is added ");
				bill.setTnprice(75.0f);
				break;
			case 5:
				System.out.println("Extra Chicken Sausage is added ");
				bill.setTnprice(75.0f);
				break;
			case 6:
				System.out.println("Extra Chicken Rasher is added ");
				bill.setTnprice(75.0f);
				break;
			case 7:
				System.out.println("Extra Chicken Keema is added ");
				bill.setTnprice(75.0f);
				break;
			case 8:
				System.out.println("You are on back menu");

				break;
			case 0:
				System.out.println("You are Exited");
				break;
			}
			break;
		}

	}
}
