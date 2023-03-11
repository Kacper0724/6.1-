package com.kodilla.good.patterns.challenges.shop.order;

import com.kodilla.good.patterns.challenges.shop.products.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

import java.time.LocalDate;
import java.time.LocalTime;

public interface OrderRepository {
    boolean createOrder(LocalDate orderDate, LocalTime orderTime, User user, Product product, int productQuantity);
}
