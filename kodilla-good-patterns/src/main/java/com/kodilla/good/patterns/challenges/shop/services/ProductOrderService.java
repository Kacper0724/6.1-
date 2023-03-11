package com.kodilla.good.patterns.challenges.shop.services;

import com.kodilla.good.patterns.challenges.shop.order.OrderRequest;

public class ProductOrderService {
    public boolean orderProduct(final OrderRequest orderRequest) {
        double totalPrice = orderRequest.getProductQuantity() * orderRequest.getProduct().getProductPrice();

        System.out.println(orderRequest.getOrderDate() + ", " + orderRequest.getOrderTime() + "\n" +
                "User order: " + orderRequest.getUser().getFirstName() + " " + orderRequest.getUser().getSureName() + "\n" +
                "Products: " + orderRequest.getProduct().getProductName() + " Price: " + orderRequest.getProduct().getProductPrice() + "PLN" + "\n" +
                "Total price: " + totalPrice + "PLN");

        return true;
    }
}
