package com.Assignment4;

import java.util.Scanner;

public class ElectricityBill {
	
	Scanner sc = new Scanner(System.in);
	int c_no;
	String c_name;
	float units;
	float bill = 0;
	
	public void read() {
		System.out.print("Consumer Number: ");
		c_no = sc.nextInt();
		System.out.print("Consumer Name: ");
		sc.nextLine();
		c_name = sc.nextLine();
		System.out.print("Number of Units Consumed: ");
		units = sc.nextFloat();
		System.out.println("Customer Details Added Successfully!!");
	}
	
	public float calculateBill() {
		if (units>0){
			if (units>0 && units<=100) {
				bill += 2*units;
			}
			else if (units>100 && units<=200) {
				bill += (2*100) + (3*(units-100));
			}
			else {
				bill += (2*100) + (3*100) + (5*(units-200));
			}
			return bill;
		}
		
		else {
			System.out.println("Calculation not possible.... Units cannot be less than 0!");
		}
		return -1;
	}
	
	public void display() {
		System.out.println("Consumer Number: " + c_no);
		System.out.println("Consumer Name: " + c_name);
		System.out.println("Number of Units Consumed: " + units);
		System.out.println("Bill: " + calculateBill());
	}
}
