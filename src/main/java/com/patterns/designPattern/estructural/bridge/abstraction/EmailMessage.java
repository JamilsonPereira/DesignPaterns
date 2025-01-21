package com.patterns.designPattern.estructural.bridge.abstraction;

public class EmailMessage implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message: " + message);
    }
}
