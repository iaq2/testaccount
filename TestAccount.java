//Ittehad Qabid Java CH7 - Opening and Closing Accounts

import java.util.Scanner;

public class TestAccount {									// Main Driver Class to test overloaded methods of the Accounts class
	public static void main (String[] args) {
		String name;
		double balance;
		@SuppressWarnings("unused")
		long acctNum;
		Accounts acct;
		
		@SuppressWarnings("resource")
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please Enter Account Holder's First Name: ");		// Asks User to input  Account Holder's First Name
		name = scan.next();
		acct = new Accounts(name);
		System.out.println("Account for " + name + ":");
		System.out.println(acct);
		
		System.out.println("\nPlease Enter Initial Balance: ");					// Asks User to input Enter Initial Balance:
		balance = scan.nextDouble();
		acct = new Accounts(balance, name);
		System.out.println("Account for " + name + ":");
		System.out.println(acct);
		
		Accounts testAcct = null;
		System.out.println("How Many Accounts Would You Like to Create? ");		// Asks amount of Accounts they would like to Create
		int num =  scan.nextInt();
		for (int i = 1; i <= num; i++) {
			testAcct = new Accounts(100, "Name" + i);
			System.out.println("\nCreated Account " + testAcct);
			System.out.println("Now There Are " + Accounts.numAccounts + " accounts");		// Prints the amount of accounts respectively.
		}
	
	}
}
