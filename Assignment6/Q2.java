package com.Assignment6;

class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double calculatePrice() {
        return price;
    }

    public double calculatePrice(int quantity) {
        return price * quantity;
    }

    public double calculatePrice(int quantity, double discount) {
        double totalPrice = price * quantity;
        return totalPrice - (totalPrice * (discount / 100.0));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Product product = new Product(101, "Wireless Mouse", 1500.0);

        System.out.println("Product ID   : " + product.productId);
        System.out.println("Product Name : " + product.productName);
        System.out.println("Base Price   : Rs. " + product.price + "\n");

        System.out.println("1. Price for 1 product                     : Rs. " + product.calculatePrice());
        System.out.println("2. Total price for 4 products              : Rs. " + product.calculatePrice(4));
        System.out.println("3. Total price for 4 products (10% discount): Rs. " + product.calculatePrice(4, 10.0));
    }
}