package com.Assignment6;

class Vehicle {
    String vehicleNo;
    String brand;
    double baseRate;

    public Vehicle(String vehicleNo, String brand, double baseRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRental() {
        return baseRate;
    }
}

class Car extends Vehicle {
    int numberOfDays;
    double insuranceCharge;

    public Car(String vehicleNo, String brand, double baseRate, int numberOfDays, double insuranceCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.insuranceCharge = insuranceCharge;
    }

    @Override
    public double calculateRental() {
        return (super.calculateRental() * numberOfDays) + insuranceCharge;
    }
}

class Bike extends Vehicle {
    int numberOfDays;
    double helmetCharge;

    public Bike(String vehicleNo, String brand, double baseRate, int numberOfDays, double helmetCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.helmetCharge = helmetCharge;
    }

    @Override
    public double calculateRental() {
        return (super.calculateRental() * numberOfDays) + helmetCharge;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Car car = new Car("UP70XX9999", "Toyota", 1500.0, 5, 2000.0);
        System.out.println("Car Details:");
        System.out.println("Vehicle No: " + car.vehicleNo + " | Brand: " + car.brand);
        System.out.println("Days Rented: " + car.numberOfDays + " | Base Rate/Day: Rs. " + car.baseRate);
        System.out.println("Insurance Charge: Rs. " + car.insuranceCharge);
        System.out.println("Total Car Rental Cost: Rs. " + car.calculateRental());
        
        System.out.println();

        Bike bike = new Bike("UP70XX0000", "Royal Enfield", 500.0, 3, 150.0);
        System.out.println("Bike Details:");
        System.out.println("Vehicle No: " + bike.vehicleNo + " | Brand: " + bike.brand);
        System.out.println("Days Rented: " + bike.numberOfDays + " | Base Rate/Day: Rs. " + bike.baseRate);
        System.out.println("Helmet Charge: Rs. " + bike.helmetCharge);
        System.out.println("Total Bike Rental Cost: Rs. " + bike.calculateRental());
    }
}