package com.Assignment4;

import java.util.Scanner;

public class Employee {
	
	Scanner sc = new Scanner(System.in);
	int emp_id;
	String emp_name;
	float basic_salary;
	float hra;
	float da;
	
	public void read() {
		System.out.print("Employee ID: ");
		emp_id = sc.nextInt();
		System.out.print("Employee Name: ");
		sc.nextLine();
		emp_name = sc.nextLine();
		System.out.print("Basic Salary: ");
		basic_salary = sc.nextFloat();
		System.out.print("HRA: ");
		hra = sc.nextFloat();
		System.out.print("DA: ");
		da = sc.nextFloat();
		System.out.println("Successful!!");
	}
	
	public float calculateSalary() {
		return (basic_salary + hra + da);
	}
	
	public void display() {
		System.out.println("-------------------------------------------------------");
		System.out.println("Employee ID: " + emp_id);
		System.out.println("Employee Name: " + emp_name);
		System.out.println("Basic Salary: " + basic_salary);
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
		System.out.println("Gross Salary: " + calculateSalary());
	}
	
}
