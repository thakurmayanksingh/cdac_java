package com.Assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill {
    String consumerNo;
    String consumerName;
    int unitsConsumed;
    double billAmount;

    public ElectricityBill() {
        this.consumerNo = "Unknown";
        this.consumerName = "Unknown";
        this.unitsConsumed = 0;
    }

    public void readDetails(Scanner scanner) {
        System.out.print("Enter Consumer No: ");
        consumerNo = scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        consumerName = scanner.nextLine();
        System.out.print("Enter Units Consumed: ");
        unitsConsumed = scanner.nextInt();
        
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Invalid Input: Units consumed cannot be negative.");
        }
    }

    public void calculateBill() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 3.0;
        } else if (unitsConsumed <= 200) {
            billAmount = (100 * 3.0) + ((unitsConsumed - 100) * 5.0);
        } else {
            billAmount = (100 * 3.0) + (100 * 5.0) + ((unitsConsumed - 200) * 8.0);
        }
    }

    public void displayBill() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer No    : " + consumerNo);
        System.out.println("Consumer Name  : " + consumerName);
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.println("Total Amount   : Rs. " + billAmount);
        System.out.println("------------------------\n");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectricityBill bill = new ElectricityBill();

        try {
            bill.readDetails(scanner);
            bill.calculateBill();
            bill.displayBill();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid numeric input provided for units.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Electricity bill processing completed.");
            scanner.close();
        }
    }
}