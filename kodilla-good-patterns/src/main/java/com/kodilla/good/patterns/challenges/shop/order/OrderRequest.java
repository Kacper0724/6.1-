package com.kodilla.good.patterns.challenges.shop.order;

import com.kodilla.good.patterns.challenges.shop.products.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderRequest {
    private final LocalDate orderDate;
    private final LocalTime orderTime;
    private final User user;
    private final Product product;
    private final int productQuantity;

    public OrderRequest(final LocalDate orderDate, final LocalTime orderTime, final User user, final Product product, final int productQuantity) {
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.user = user;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
