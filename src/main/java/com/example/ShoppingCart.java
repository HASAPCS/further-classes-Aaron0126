package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productsList;

    public ShoppingCart() {
        // TODO: Initialize the list of products
        this.productsList = new ArrayList<Product>();
    }

    // TODO: Implement methods to add a product, remove a product, and calculate the total cost
    public void addProduct(Product product) {
        productsList.add(product); 
    }
    public void removeProduct(Product product) {
        productsList.remove(product);
    }
}
