package com.redcode.productmanagementsystem.entity;

import java.util.Objects;

// Concrete class for Apparel products
public class Apparel implements Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;
    private String size;
    private String color;

    // Constructor
    public Apparel(int productId, String name, double price, int quantity, String size, String color) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    // Implementing methods from Product interface
    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Apparel Product");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apparel apparel = (Apparel) o;
        return productId == apparel.productId && Double.compare(price, apparel.price) == 0 && quantity == apparel.quantity && Objects.equals(name, apparel.name) && Objects.equals(size, apparel.size) && Objects.equals(color, apparel.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, quantity, size, color);
    }

    @Override
    public String toString() {
        return "Apparel{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

