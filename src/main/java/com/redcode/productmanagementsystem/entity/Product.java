package com.redcode.productmanagementsystem.entity;

// Interface for Product
public interface Product {
    // Abstract methods
    int getProductId();
    void setProductId(int productId);

    String getName();
    void setName(String name);

    double getPrice();
    void setPrice(double price);

    int getQuantity();
    void setQuantity(int quantity);

    void displayProductInfo(); // Abstract method to display product information
}
