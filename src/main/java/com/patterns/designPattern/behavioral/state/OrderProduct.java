package com.patterns.designPattern.behavioral.state;

public class OrderProduct {

    OrderState orderState;

    public OrderProduct() {
        this.orderState = new OrderPendingState();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void nextState(){
        orderState.nexState(this);
    }

    public void cancelOrder(){
        orderState.cancelOrder(this);
    }
}
