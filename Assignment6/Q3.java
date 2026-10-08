package com.Assignment6;

class BankAccount {
    int accountNo;
    String accountHolderName;
    double balance;

    public BankAccount(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.0; 
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNo, String accountHolderName, double balance, double interestRate) {
        super(accountNo, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100.0);
    }
}

class CurrentAccount extends BankAccount {
    double interestRate;

    public CurrentAccount(int accountNo, String accountHolderName, double balance, double interestRate) {
        super(accountNo, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100.0);
    }
}

public class Q3 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, "Alice", 50000.0, 4.5);
        System.out.println("Savings Account Holder: " + savings.accountHolderName);
        System.out.println("Savings Account Balance: Rs. " + savings.balance);
        System.out.println("Savings Account Interest (4.5%): Rs. " + savings.calculateInterest());
        
        System.out.println();

        CurrentAccount current = new CurrentAccount(102, "Bob", 75000.0, 1.5);
        System.out.println("Current Account Holder: " + current.accountHolderName);
        System.out.println("Current Account Balance: Rs. " + current.balance);
        System.out.println("Current Account Interest (1.5%): Rs. " + current.calculateInterest());
    }
}