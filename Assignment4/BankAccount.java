package com.Assignment4;

import java.util.*;

public class BankAccount {
	Scanner sc = new Scanner(System.in);
	int acc_no;
	String cust_name;
	float balance;
	
	public void read() {
		System.out.print("Account Number: ");
		acc_no = sc.nextInt();
		System.out.print("Customer Name: ");
		sc.nextLine();
		cust_name = sc.nextLine();
		System.out.print("Balance: ");
		balance = sc.nextFloat();
		System.out.println("Customer Details Added Successfully!!");
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount to Deposit: ");
		float amount = sc.nextFloat();
		if (amount>0) {
			balance += amount;
			System.out.println("Balance is updated1!");
			System.out.println("Updated Balance: " + balance);
		}
	}
	
	public void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		float withdraw = sc.nextFloat();
		if ((withdraw <= balance) && (withdraw > 0)) {
			balance -= withdraw;
			System.out.println("Amount Withdrawn Successfully!!");
			System.out.println("Updated Balance: " + balance);
		}
	}
	
	public void display() {
		System.out.println("Account Number: " + acc_no);
		System.out.println("Customer Name: " + cust_name);
		System.out.println("Balance: " + balance);
	}
}
