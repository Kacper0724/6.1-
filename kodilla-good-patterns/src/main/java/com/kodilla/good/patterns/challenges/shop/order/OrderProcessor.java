package com.kodilla.good.patterns.challenges.shop.order;

import com.kodilla.good.patterns.challenges.shop.services.InformationService;
import com.kodilla.good.patterns.challenges.shop.services.ProductOrderService;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService ProductOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final ProductOrderService ProductOrderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.ProductOrderService = ProductOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        System.out.println("--------------------------");
        boolean isOrdered = ProductOrderService.orderProduct(orderRequest);
        System.out.println("--------------------------");
        if (isOrdered) {
            System.out.println("Mail -> " + orderRequest.getUser().getFirstName());
            informationService.inform(orderRequest.getUser());
            System.out.println("--------------------------");
            orderRepository.createOrder(orderRequest.getOrderDate(), orderRequest.getOrderTime(), orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getProductQuantity());
            System.out.println("--------------------------");
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
