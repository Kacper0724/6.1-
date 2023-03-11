package com.kodilla.good.patterns.challenges.shop.products;

public class Product {
    private final String productName;
    private final double productPrice;

    public Product (final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
