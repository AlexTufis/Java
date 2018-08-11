import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerKey;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	/*	Set customer data*/
	
	public int setCustomerKey(int customerKey) {
		this.customerKey = customerKey;
		return customerKey;
	}
	
	public int getCustomerKey() {
		return customerKey;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* Calculate Checking Account withdraw */
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}
	
	/* Calculate Saving Account withdraw */
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}
	
	/* Calculate Checking Account deposit */
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("\r\n" + "It is not possible to perform the operation." + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance: " + savingBalance + "\n");
		} else {
			System.out.println("It is not possible to perform the operation." + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to deposit from Checking Account: ");
		double amount = input.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("It is not possible to perform the operation." + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit from Saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance) + "\n");
		} else {
			System.out.println("It is not possible to perform the operation." + "\n");
		}
	}
	
	
		
}
