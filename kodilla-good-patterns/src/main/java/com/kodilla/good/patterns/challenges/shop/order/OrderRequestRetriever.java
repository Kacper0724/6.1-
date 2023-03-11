package com.kodilla.good.patterns.challenges.shop.order;

import com.kodilla.good.patterns.challenges.shop.products.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        LocalDate orderDate = LocalDate.now();
        LocalTime orderTime = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
        User user = new User("Jason", "Brody");

        Product product = new Product("Logitech G502 X Plus Black", 649.99);

        return new OrderRequest(orderDate, orderTime, user, product, 1);
    }
}
