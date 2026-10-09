package com.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    public Product() {
    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void read(Scanner scanner) {
        System.out.print("Enter Product ID: ");
        productId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        productName = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        price = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Product ID: " + productId + " | Name: " + productName + " | Price: Rs. " + price);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            Product p = new Product();
            p.read(scanner);
            productList.add(p);
            System.out.println();
        }

        System.out.println("--- All Products ---");
        double totalPrice = 0;
        Product highestPricedProduct = productList.get(0);

        for (Product p : productList) {
            p.display();
            totalPrice += p.price;
            
            if (p.price > highestPricedProduct.price) {
                highestPricedProduct = p;
            }
        }

        System.out.println("\nTotal Price of all products: Rs. " + totalPrice);
        
        System.out.println("\n--- Product with the Highest Price ---");
        highestPricedProduct.display();

        scanner.close();
    }
}