package com.Assignment7;

abstract class Vehicle {
	String vehicleNo;
	String brand;
	float rentalRate;
	
	public Vehicle(String vehicleNo, String brand, float rentalRate) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.rentalRate = rentalRate;
	}
	
	void displayVehicleDetails() {
		System.out.println("Vehicle Number: " + vehicleNo);
		System.out.println("Brand: " + brand);
		System.out.println("Rental Rate: " + rentalRate);
	}
	
	public abstract float calculateRental(int days);
	
}

class Car extends Vehicle {
	int numberOfSeats;
	float insuranceCharge;
	
	public Car(String vehicleNo, String brand, float rentalRate, int numberOfSeats, float insuranceCharge) {
		super(vehicleNo, brand, rentalRate);
		this.numberOfSeats = numberOfSeats;
		this.insuranceCharge = insuranceCharge;
	}
	
	public float calculateRental(int days) {
		return rentalRate+insuranceCharge;
	}
	
	void displayCarDetails() {
		super.displayVehicleDetails();
		System.out.println("Number of Seats: " + numberOfSeats);
		System.out.println("Insurance Charge: " + insuranceCharge);
	}
	
}

public class Q1 {
	public static void main(String[] args) {
		Car c = new Car("UP70GK0909", "Toyota", 75000, 5, 2700);
		c.displayCarDetails();
		System.out.println("Calculated Rental Price: " + c.calculateRental(5));
	}
}
