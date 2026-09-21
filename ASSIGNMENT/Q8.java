package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int n1 = sc.nextInt();
		System.out.print("Enter Second Number = ");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.print(n1 + " is greater than " + n2);
		}
		else if (n2 > n1) {
			System.out.print(n2 + " is greater than " + n1);
		}
		else {
			System.out.print(n1 + " is equals to " + n2);
		}
		sc.close();
	}
}
