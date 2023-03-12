package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.time.LocalDate;
import java.time.LocalTime;

public class HealthyShop implements Shop {
    public boolean process(LocalDate orderDate, LocalTime orderTime, final Product product, final int quantity) {
        System.out.println(orderDate + ", " + orderTime + "\n" +
                "<HealthyShop>\n" +
                "Prepare: " + product.getProductType() + ", Product: " + product.getProductName() + " ID: " + product.getProductID() + " Quantity: " + quantity + "\n" +
                "Price: " + product.getProductPrice() + "\n");
        return true;
    }
}
