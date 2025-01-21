package com.patterns.designPattern.estructural.decorator.concretDecorator;

import com.patterns.designPattern.estructural.decorator.Notification;
import com.patterns.designPattern.estructural.decorator.abstractDecorator.NotificationDecorator;

public class SendSms extends NotificationDecorator {
    public SendSms(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Send sms: " + message);
    }
}
