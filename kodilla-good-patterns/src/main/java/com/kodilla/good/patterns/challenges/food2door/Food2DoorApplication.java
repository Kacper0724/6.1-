package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.OrderDto;
import com.kodilla.good.patterns.challenges.food2door.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.food2door.order.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class Food2DoorApplication {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        OrderRequest orderRequest = new OrderRequest(1, 2);
        OrderRequest orderRequest1 = new OrderRequest(6, 1);

        OrderProcessor orderProcessor = new OrderProcessor(productRepository);

        OrderDto orderDto = orderProcessor.orderProcess(orderRequest);
        OrderDto orderDto1 = orderProcessor.orderProcess(orderRequest1);

        System.out.println("Status of orders");
        orderDto.takeOrderStatus();
        orderDto1.takeOrderStatus();
    }
}
