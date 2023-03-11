package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.shop.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.shop.order.OrderRequest;
import com.kodilla.good.patterns.challenges.shop.order.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.shop.order.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.shop.services.MailService;
import com.kodilla.good.patterns.challenges.shop.services.ProductOrderService;

public class ProductOrderServiceApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
