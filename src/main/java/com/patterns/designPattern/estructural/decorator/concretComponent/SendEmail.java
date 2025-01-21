package com.patterns.designPattern.estructural.decorator.concretComponent;

import com.patterns.designPattern.estructural.decorator.Notification;

public class SendEmail implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Send Email: " + message);
    }
}
