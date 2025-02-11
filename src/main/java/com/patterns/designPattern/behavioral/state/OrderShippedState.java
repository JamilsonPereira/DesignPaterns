package com.patterns.designPattern.behavioral.state;

public class OrderShippedState implements OrderState{
    @Override
    public void nexState(OrderProduct order) {
        System.out.println("order sent, no more transitions here");
    }

    @Override
    public void cancelOrder(OrderProduct order) {
        System.out.println("Unable to cancel order sent");
    }
}
