package TaskSolver;

import java.util.*;

public class ATMinterface {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Hello,Welcome to ATM");
		boolean set=false;
		while(!set) {
			System.out.println("Press the button to perform action");
			System.out.println("1. For withdrawing amount from the bank account");
			System.out.println("2. Depositing the amount in bank account");
			System.out.println("3. Check Bank Balance");
			int choices=scan.nextInt();
			if(choices==1) {
				withdraw();
			}
			else if(choices==2) {
				deposit();
			}
			else if(choices==3) {
				checkBalance();
			}
			else {
				System.out.println("Invalid choice. Please enter a number between 1 and 3.");
				
			}
		}
	}

	  private static void checkBalance() {
		  System.out.print("Balance in the account : "+UserBankAccount.balance);
		  System.out.println(" ");
		  return;
	}

	static void deposit() {
		System.out.println("Enter the amonut to deposit");
		double depositamount=scan.nextDouble();
		UserBankAccount.balance=UserBankAccount.balance+depositamount;
		System.out.println("Successfully the amount is deposited in the account");
		return;
	}

	static void withdraw() {
		System.out.println("Welcome to the withdrwal section");
		boolean set=false;
		while(!set) {
			System.out.println("Enter the amount to be withdrwal");
			double amount=scan.nextDouble();
			if(amount>UserBankAccount.balance) {
				System.out.println("The amount is not withdrwal as not sufficient in the account ");
			}
			else {
				UserBankAccount.balance=UserBankAccount.balance-amount;
				set=true;
			}
		}
	}

}
