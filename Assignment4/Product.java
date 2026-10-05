package com.Assignment4;

import java.util.Scanner;

public class Product {
	Scanner sc = new Scanner(System.in);
	int p_id;
	String p_name;
	float price;
	int qty;
	
	public void read() {
		System.out.print("Product ID: ");
		p_id = sc.nextInt();
		System.out.print("Product Name: ");
		sc.nextLine();
		p_name = sc.nextLine();
		System.out.print("Price: ");
		price = sc.nextFloat();
		System.out.print("Quantity: ");
		qty = sc.nextInt();
		System.out.println("Product Details Added Successfully!!");
	}
	
	public float calculateBill() {
		return price*qty;
	}
	
	public void display() {
		System.out.println("-----------------------------BILL--------------------------");
		System.out.println("Product ID: " + p_id);
		System.out.println("Product Name: " + p_name);
		System.out.println("Price: " + price);
		System.out.println("Bill: " + calculateBill());
	}
	
}
