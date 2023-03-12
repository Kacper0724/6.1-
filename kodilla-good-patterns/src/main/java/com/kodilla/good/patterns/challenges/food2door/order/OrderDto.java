package com.kodilla.good.patterns.challenges.food2door.order;

public class OrderDto {
    private final OrderRequest orderRequest;
    private final boolean isOrdered;

    public OrderDto(final OrderRequest orderRequest, final boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }

    public void takeOrderStatus() {
        if (isOrdered) {
            System.out.println("Product: " + orderRequest.getProductID() + " is ordered!");
        } else {
            System.out.println("Product: " + orderRequest.getProductID() + " is not ordered!");
        }
    }
}
