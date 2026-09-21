package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal = ");
		double p = sc.nextDouble();
		System.out.print("Rate = ");
		float r = sc.nextFloat();
		System.out.print("Time = ");
		float t = sc.nextFloat();
		double si = (p*r*t)/100;
		double amount = (p+si);
		System.out.println("Simple Interest = " + si);
		System.out.println("Amount = " + amount);
		sc.close();
	}
}
