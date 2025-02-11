package com.patterns.designPattern.behavioral.state;

public class OrderDeliveryState implements OrderState{
    @Override
    public void nexState(OrderProduct order) {
        System.out.println("Order Shipped");
        order.setOrderState(new OrderShippedState());


    }

    @Override
    public void cancelOrder(OrderProduct order) {
        System.out.println("not possible cancel order paid");
    }
}
