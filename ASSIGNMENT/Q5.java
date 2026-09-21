package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mathematics Marks = ");
		float m = sc.nextFloat();
		System.out.print("Physics Marks = ");
		float p = sc.nextFloat();
		System.out.print("Chemistry Marks = ");
		float c = sc.nextFloat();
		float total_marks = p+c+m;
		float avg = (float)(total_marks/3);
		System.out.println("Total Marks = " + total_marks);
		System.out.print("Average = " + avg);
		sc.close();
	}
}
