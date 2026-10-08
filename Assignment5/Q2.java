package com.Assignment5;

class Vehicle{
	
	String vehicleNo;
	String brand;
	float price;
	
	public Vehicle(String vehicleNo, String brand, float price) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}
	
	void displayVehicleDetails() {
		System.out.println("Vehicle Number: " + vehicleNo);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price + " INR");
	}
	
	float calculateTax() {
		return price * 0.18f;
	}

}

class Car extends Vehicle{
	
	String model;
	String fuelType;
	
	public Car(String vehicleNo, String brand, float price, String model, String fuelType) {
		super(vehicleNo, brand, price);
		this.model = model;
		this.fuelType = fuelType;
	}
	
	void displayCarDetails() {
		displayVehicleDetails();
		System.out.println("Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
	}
	
	float calculateInsurance() {
		return price * 0.9f;
	}
	
}

class ElectricCar extends Car{
	
	float batteryCapacity;
	float chargingTime;
	
	public ElectricCar(String vehicleNo, String brand, float price, String model, String fuelType, float batteryCapacity, float chargingTime) {
		super(vehicleNo, brand, price, model, fuelType);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}

	void displayElectricCarDetails() {
		displayCarDetails();
		System.out.println("Battery Capacity: " + batteryCapacity + " %");
		System.out.println("Charging Time: " + chargingTime + " Hours");
	}
	
	float calculateRange() {
		return batteryCapacity * 4;
	}
	
}

public class Q2 {
	public static void main(String[] args) {
		ElectricCar e1 = new ElectricCar("UP709999", "Toyota", 2900000, "Top Model", "Petrol", 93.4f, 4.5f);
		e1.displayElectricCarDetails();
		e1.displayCarDetails();
		e1.displayVehicleDetails();
	}
}
