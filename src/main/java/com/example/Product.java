package com.example;

public class Product {
    private String name;
    private double price;
    private int productID;

    public Product(String name, double price, int productID) {
        // TODO: Initialize the attributes
        this.name=name;
        this.price=price;
        this.productID=productID;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getProductID(){
        return productID;
    }
    
    // TODO: Implement getters, setters, and any other methods you find necessary
}
