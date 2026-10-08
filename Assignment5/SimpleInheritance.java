package com.Assignment5;

class Employee{
	
	int employeeId;
	String employeeName;
	float basicSalary;
	
	public Employee(int employeeId, String employeeName, float basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	
	float calculateSalary() {
		return basicSalary;
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Basic Salary: " + basicSalary);
	}
	
}

class Manager extends Employee{
	
	String department;
	float bonus;
	
	public Manager(int employeeId, String employeeName, float basicSalary, String department, float bonus) {
		super(employeeId, employeeName, basicSalary);
		this.department = department;
		this.bonus = bonus;
	}
	
	float calculateSalary() {
		return basicSalary + bonus;
	}
	
	void displayManagerDetails() {
		displayEmployeeDetails();
		System.out.println("Department: " + department);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + calculateSalary());
	}
}

public class SimpleInheritance {
	public static void main(String[] args) {
		Manager m1 = new Manager(1001, "Mayank Singh", 89000.0f, "A.I", 9000.0f);
		
		m1.displayManagerDetails();
	}
}
