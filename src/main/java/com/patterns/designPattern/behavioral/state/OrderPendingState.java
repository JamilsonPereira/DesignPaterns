package com.patterns.designPattern.behavioral.state;

public class OrderPendingState implements OrderState{


    @Override
    public void nexState(OrderProduct order) {
        System.out.println("Order confirmed. Order is now in Paid state");
        order.setOrderState(new OrderPaidState());
    }

    @Override
    public void cancelOrder(OrderProduct order) {
        System.out.println("Order canceled.");
        order.setOrderState(new OrderCanceledState());
    }
}
