package com.Assignment4;

import java.util.Scanner;

public class MovieTicket {
	Scanner sc = new Scanner(System.in);
	String c_name;
	String m_name;
	float t_qty;
	int t_price;
	
	public void read() {
		System.out.print("Customer Name: ");
//		sc.nextLine();
		c_name = sc.nextLine();
		System.out.print("Movie Name: ");
//		sc.nextLine();
		m_name = sc.nextLine();
		System.out.print("Number of Tickets: ");
		t_qty = sc.nextFloat();
		System.out.print("Ticket Price: ");
		t_price = sc.nextInt();
		System.out.println("Successful!!");
	}
	
	public float calculateAmount() {
		return t_price*t_qty;
	}
	
	public void display() {
		System.out.println("-------------------------------------------------------");
		System.out.println("Customer Name: " + c_name);
		System.out.println("Movie Name: " + m_name);
		System.out.println("Number of Tickets: " + t_qty);
		System.out.println("Ticket Price: " + t_price);
		System.out.println("Total Amount: " + calculateAmount());
	}
	
}
