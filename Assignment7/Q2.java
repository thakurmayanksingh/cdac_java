package com.Assignment7;

interface Payment {
    void processPayment(double amount);
    void displayPaymentDetails();
}

class UPIPayment implements Payment {
    String transactionId;
    String upiId;
    double paymentAmount;

    public UPIPayment(String transactionId, String upiId) {
        this.transactionId = transactionId;
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        this.paymentAmount = amount;
        System.out.println("Processing UPI payment of Rs. " + amount);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("UPI ID: " + upiId);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs. " + paymentAmount);
        System.out.println();
    }
}

class CardPayment implements Payment {
    String transactionId;
    String cardNumber;
    double paymentAmount;

    public CardPayment(String transactionId, String cardNumber) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        this.paymentAmount = amount;
        System.out.println("Processing Card payment of Rs. " + amount);
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs. " + paymentAmount);
        System.out.println();
    }
}

public class Q2 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment("TXN98765UPI", "alice@okicici");
        upi.processPayment(1500.0);
        upi.displayPaymentDetails();

        CardPayment card = new CardPayment("TXN12345CARD", "4532 1234 8765 0987");
        card.processPayment(4500.50);
        card.displayPaymentDetails();
    }
}