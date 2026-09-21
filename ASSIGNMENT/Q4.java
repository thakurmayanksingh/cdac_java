package com.CDAC.ASSIGNMENT;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Celcius = ");
		float cel = sc.nextFloat();
		float fah = (float)(cel * (9f/5f)) + 32;
		System.out.print("Fahrenheight = " + fah);
		sc.close();
	}
}
