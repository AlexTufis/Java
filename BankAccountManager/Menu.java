import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Menu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	int select;
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException {
		int ok = 1;
		
		do {
			try {
				data.put(1998, 12345);
				
				System.out.println("Welcome to the ATM by Alex Tufis");
				
				System.out.println("Enter your Customer Key: ");
				setCustomerKey(menuInput.nextInt());
				
				System.out.println("Enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n" + "Invalid" + "\n");
				ok = 2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getCustomerKey() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Name or Pin Number." + "\n");
		} while(ok==1);
	}

	private void getAccountType() {
		// TODO Auto-generated method stub
		System.out.println("Select the Account you want to acces: ");
		System.out.println("Press 1 - Checking Account");
		System.out.println("Press 2 - Saving Account");
		System.out.println("Press 3 - Exit");
		System.out.print("Choice: ");
		
		select = menuInput.nextInt();
		
		switch(select) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you!");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}

	private void getChecking() {
		// TODO Auto-generated method stub
		System.out.println("Checking Account: ");
		System.out.println("Press 1 - View Balance");
		System.out.println("Press 2 - Withdraw Money");
		System.out.println("Press 3 - Deposit Money");
		System.out.println("Press 4 - Exit");
		System.out.print("Choice: ");

		select = menuInput.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you!");
			break;
			
		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getChecking();
		}	
	}
	
	private void getSaving() {
		// TODO Auto-generated method stub
		System.out.println("Saving Account: ");
		System.out.println("Press 1 - View Balance");
		System.out.println("Press 2 - Withdraw Money");
		System.out.println("Press 3 - Deposit Money");
		System.out.println("Press 4 - Exit");
		System.out.print("Choice: ");

		select = menuInput.nextInt();

		switch (select) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()) + "\n");
			getAccountType();
			break;

		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You!");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getSaving();
		}
	}
	
}
