package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.print("The number is Zero!!");
		}
		else if (num > 0) {
			System.out.print("The number is a Positive Number!!");
		}
		else {
			System.out.print("The number is a Negative Number!!");
		}
		sc.close();
	}
}
