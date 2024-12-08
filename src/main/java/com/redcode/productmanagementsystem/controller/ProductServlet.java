package com.redcode.productmanagementsystem.controller;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class ProductServlet implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet Initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // Set response content type
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Get form data
        String productType = req.getParameter("productType");
        int productId = Integer.parseInt(req.getParameter("productId"));
        String productName = req.getParameter("productName");
        double price = Double.parseDouble(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        // Print the form data to console
        System.out.println("Product Details Received:");
        System.out.println("Product Type: " + productType);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);

        if ("Apparel".equalsIgnoreCase(productType)) {
            String size = req.getParameter("size");
            String color = req.getParameter("color");

            System.out.println("Size: " + size);
            System.out.println("Color: " + color);
        } else if ("ElectronicItem".equalsIgnoreCase(productType)) {
            String brand = req.getParameter("brand");
            int warranty = Integer.parseInt(req.getParameter("warranty"));

            System.out.println("Brand: " + brand);
            System.out.println("Warranty (Months): " + warranty);
        } else if ("StationaryItem".equalsIgnoreCase(productType)) {
            String category = req.getParameter("category");

            System.out.println("Category: " + category);
        } else {
            System.out.println("Unknown Product Type");
        }

        // Respond success on After Submit Button
        out.println("<h3>Product details received! Check server console for the output.</h3>");
    }

    @Override
    public String getServletInfo() {
        return "InsertProductServlet - A servlet to insert product details.";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}
