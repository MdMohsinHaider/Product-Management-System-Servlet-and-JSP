package com.redcode.productmanagementsystem.entity;

import java.util.Objects;

// Concrete class for Electronic Items
public class ElectronicItem implements Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;
    private String brand;
    private int warrantyInMonths;

    public ElectronicItem(int productId, String name, double price, int quantity, String brand, int warrantyInMonths) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.warrantyInMonths = warrantyInMonths;
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
        System.out.println("Electronic Item");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warrantyInMonths + " months");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicItem that = (ElectronicItem) o;
        return productId == that.productId && Double.compare(price, that.price) == 0 && quantity == that.quantity && warrantyInMonths == that.warrantyInMonths && Objects.equals(name, that.name) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, quantity, brand, warrantyInMonths);
    }

    @Override
    public String toString() {
        return "ElectronicItem{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", warrantyInMonths=" + warrantyInMonths +
                '}';
    }
}
