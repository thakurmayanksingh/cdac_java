package com.Assignment6;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int unitsConsumed;

    public ElectricityBill(int consumerNo, String consumerName, int unitsConsumed) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        return unitsConsumed * 8.0;
    }

    public double calculateBill(double rate) {
        return unitsConsumed * rate;
    }

    public double calculateBill(double rate, int units) {
        return units * rate;
    }
}

public class Q1 {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(12345, "Alice Smith", 250);
        
        System.out.println("Consumer No   : " + bill.consumerNo);
        System.out.println("Consumer Name : " + bill.consumerName);
        System.out.println("Units Consumed: " + bill.unitsConsumed + " units\n");
        
        System.out.println("1. Bill amount (Default rate Rs. 8/unit)           : Rs. " + bill.calculateBill());
        System.out.println("2. Bill amount (Custom rate Rs. 10.5/unit)         : Rs. " + bill.calculateBill(10.5));
        System.out.println("3. Bill amount (Custom rate Rs. 12/unit, 300 units): Rs. " + bill.calculateBill(12.0, 300));
    }
}