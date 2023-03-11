package com.kodilla.good.patterns.challenges.shop.order;

import com.kodilla.good.patterns.challenges.shop.products.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(LocalDate orderDate, LocalTime orderTime, User user, Product product, int productQuantity) {
        System.out.println(orderDate + ", " + orderTime + "\n" +
                "User: " + user.getFirstName() + " " + user.getSureName() + "\n" +
                "Products: " + product.getProductName() + " Price: " + product.getProductPrice() + "PLN" + " Quantity: " + productQuantity);
        return true;
    }
}
