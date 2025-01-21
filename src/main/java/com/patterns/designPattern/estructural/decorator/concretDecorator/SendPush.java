package com.patterns.designPattern.estructural.decorator.concretDecorator;

import com.patterns.designPattern.estructural.decorator.Notification;
import com.patterns.designPattern.estructural.decorator.abstractDecorator.NotificationDecorator;

public class SendPush extends NotificationDecorator {
    public SendPush(Notification notification) {
        super(notification);
    }


    @Override
    public void sendNotification(String message) {
        System.out.println("Send push: " + message);
    }
}
