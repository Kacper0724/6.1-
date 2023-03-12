package com.kodilla.good.patterns.challenges.food2door.order;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class OrderRequest implements Order {
    public LocalDate orderDate = LocalDate.now();
    public LocalTime orderTime = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
    private final int productID;
    private final int quantity;

    public OrderRequest(int productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }
}
