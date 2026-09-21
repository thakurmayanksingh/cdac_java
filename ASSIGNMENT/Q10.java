package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks = ");
		float marks = sc.nextFloat();
		if (marks >= 40) {
			System.out.print("Pass!!!");
		}
		else {
			System.out.print("Fail!!");
		}
		sc.close();
	}
}
