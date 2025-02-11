package com.patterns.designPattern.behavioral.state;

public class Main {
    public static void main(String[]args){
        OrderProduct orderProduct = new OrderProduct();

        orderProduct.nextState();
        orderProduct.nextState();
        orderProduct.nextState();
        orderProduct.nextState();
        orderProduct.cancelOrder();

        System.out.println("\n ----  Create a new order and cancel ---\n");

        OrderProduct orderProduct1 = new OrderProduct();
        orderProduct1.cancelOrder();
        orderProduct.nextState();
    }
}
