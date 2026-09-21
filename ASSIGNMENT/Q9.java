package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age = ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.print("Eligible to vote!!!");
		}
		else {
			System.out.print("Not Eligible to vote!!");
		}
		sc.close();
	}

}
