package com.patterns.designPattern.behavioral.state;



public interface OrderState {
    public void nexState(OrderProduct order);
    void cancelOrder(OrderProduct order);
}
