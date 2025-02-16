package javaTask;

import java.util.Scanner;

public class Account {
	
	String accountName;
	int accountNo,balance;
	static Scanner input = new Scanner(System.in);
	
	Account() {
		System.out.println("Welcome you to Account Programming...");
	}
	public Account(String accountName,int accountNo) {
		this.accountName = accountName;
		this.accountNo = accountNo;
		balance = 10000;
	}
	public void withdraw() {
		
		System.out.print("Enter amount to withdraw: ");
		int withdrawAmt = input.nextInt();
		if (withdrawAmt >= balance) {
			System.out.print("Insufficient Balance...");
		}else {
			balance = balance - withdrawAmt;
		}
		System.out.println("The amount "+withdrawAmt+" is withdrawed");
		System.out.println("The Account balance is "+balance);
		}
	public void depoist() {
		
		System.out.print("Enter Amount to depoist: ");
		int depoistAmt = input.nextInt();
		
		balance = balance + depoistAmt;
		
		System.out.println("The amount "+depoistAmt+" is depoisted");
		System.out.println("The Account balance is "+balance);}
	public int checkBalance() {return balance;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Account Obj = new Account();
		Account operations = new Account("Chakkaravarthi",1234567890);
		System.out.println("AccountName: "+operations.accountName);
		System.out.println("AccountNo: "+operations.accountNo);
		
		System.out.println("Enter banking process:");
		System.out.println("1. Check Balance 2.Withdraw 3.depoist 4.0 for exit");
		System.out.print("Enter option: ");
		int process = input.nextInt();
		
		while (process !=0) {
			if (process == 1) {
				System.out.println("Account Balance: "+operations.checkBalance());
				System.out.print("Want continue Fruther or press 0 for exit: ");
				process = input.nextInt();
			}else if (process == 2) {
				operations.withdraw();
				System.out.print("Want continue Fruther or press 0 for exit: ");
				process = input.nextInt();
			}else if (process == 3) {
				operations.depoist();
				System.out.print("Want continue Fruther or press 0 for exit: ");
				process = input.nextInt();
			}
		}
		
	}

}
