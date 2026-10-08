package com.Assignment5;

class BankAccount {
	
	String accountNo;
	String accountHolderName;
	double balance;
	
	public BankAccount(String accountNo, String accountHolderName, double balance) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}
	
	void displayAccountDetails() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
	
}

class SavingsAccount extends BankAccount {
	
	float interestRate;

	public SavingsAccount(String accountNo, String accountHolderName, double balance, float interestRate) {
		super(accountNo, accountHolderName, balance);
		this.interestRate = interestRate;
	}
	
	double calculateInterest() {
		return balance * interestRate * 0.01d;
	}
	
	void displaySavingsDetails() {
		displayAccountDetails();
		System.out.println("Interest Rate: " + interestRate);
		System.out.println("Interest: " + calculateInterest());
	}
	
}

class CurrentAccount extends BankAccount {
	
	int overdraftLimit;

	public CurrentAccount(String accountNo, String accountHolderName, double balance, int overdraftLimit) {
		super(accountNo, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	int checkOverdraftLimit() {
		return overdraftLimit;
	}
	
	void displayCurrentAccountDetails() {
		displayAccountDetails();
		System.out.println("Overdraft Limit: " + checkOverdraftLimit());
	}
	
}

public class Q3 {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("123456789", "Mayank Singh", 990000, 8);
		sa.displaySavingsDetails();
		
		System.out.println();
		
		CurrentAccount ca = new CurrentAccount("987654321", "Mayank Singh", 50000, 100000);
		ca.displayCurrentAccountDetails();
	}
}