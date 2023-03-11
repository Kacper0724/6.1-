package com.kodilla.good.patterns.challenges.shop.services;

import com.kodilla.good.patterns.challenges.shop.products.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

public interface OrderService {
    boolean order(User user, Product product, int productQuantity);
}
