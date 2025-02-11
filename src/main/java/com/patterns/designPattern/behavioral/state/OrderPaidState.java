package com.patterns.designPattern.behavioral.state;

public class OrderPaidState implements OrderState{
    @Override
    public void nexState(OrderProduct order) {
        System.out.println("Order is paid");
        order.setOrderState(new OrderDeliveryState());
    }

    @Override
    public void cancelOrder(OrderProduct order) {
        System.out.println("not possible cancel order paid");
    }
}
