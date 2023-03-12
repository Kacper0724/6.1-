package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;
import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

public class OrderProcessor {
    private final ProductRepository productRepository;

    public OrderProcessor(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public OrderDto orderProcess(OrderRequest orderRequest) {
        Shop shop = productRepository.getProductShop(orderRequest.getProductID());
        boolean isOrdered = shop.process(orderRequest.getOrderDate(), orderRequest.getOrderTime(), productRepository.getProductFromRepository(orderRequest.getProductID()), orderRequest.getQuantity());
        return new OrderDto(orderRequest, isOrdered);
    }
}
