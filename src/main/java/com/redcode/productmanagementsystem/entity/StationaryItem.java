package com.redcode.productmanagementsystem.entity;

import java.util.Objects;

// Concrete class for Stationary Items
public class StationaryItem implements Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;
    private String category;

    public StationaryItem(int productId, String name, double price, int quantity, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

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
        System.out.println("Stationary Item");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StationaryItem that = (StationaryItem) o;
        return productId == that.productId && Double.compare(price, that.price) == 0 && quantity == that.quantity && Objects.equals(name, that.name) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, quantity, category);
    }

    @Override
    public String toString() {
        return "StationaryItem{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}

