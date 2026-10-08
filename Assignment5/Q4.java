package com.Assignment5;

class Product {
	
	int productId;
	String productName;
	float price;
	
	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	float calculateDiscount() {
		if (price>0) {
			if (price<999) {
				return price*0.01f;
			}
			else if (price>999 && price<5000) {
				return price * 0.05f;
			}
			else if (price>5000 && price<10000) {
				return price * 0.08f;
			}
			else {
				return price * 0.14f;
			}
		}
		else {
			System.out.println("Price Should Be Greater than 0!!!");
			return 0;
		}
		
	}
	
	void displayProductDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
	
}

class Electronics extends Product {
	
	String brand;
	int warranty;
	
	public Electronics(int productId, String productName, float price, String brand, int warranty) {
		super(productId, productName, price);
		this.brand = brand;
		this.warranty = warranty;
	}
	
	float calculateFinalPrice() {
		return price - calculateDiscount();
	}
	
	void displayElectronicsDetails() {
		displayProductDetails();
		System.out.println("Brand: " + brand);
		System.out.println("Warranty: " + warranty);
		System.out.println("Final Price: " + calculateFinalPrice());
	}
	
}

class Clothing extends Product {
	
	char size;
	String material;
	
	public Clothing(int productId, String productName, float price, char size, String material) {
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}
	
	float calculateFinalPrice() {
		return price - calculateDiscount();
	}
	
	void displayClothingDetails() {
		displayProductDetails();
		System.out.println("Size: " + size);
		System.out.println("Material: " + material);
		System.out.println("Final Price: " + calculateFinalPrice());
	}
	
}

public class Q4 {
	public static void main(String[] args) {
		Clothing c = new Clothing(1011, "Shirt", 799, 'L', "Cotton");
		c.displayClothingDetails();
		System.out.println();
		Electronics e = new Electronics(1015, "Laptop", 72999, "HP", 3);
		e.displayElectronicsDetails();
	}
}
