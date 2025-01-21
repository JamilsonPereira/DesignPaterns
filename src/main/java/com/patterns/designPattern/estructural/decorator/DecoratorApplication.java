package com.patterns.designPattern.estructural.decorator;

import com.patterns.designPattern.estructural.decorator.abstractDecorator.NotificationDecorator;
import com.patterns.designPattern.estructural.decorator.concretComponent.SendEmail;
import com.patterns.designPattern.estructural.decorator.concretDecorator.SendPush;
import com.patterns.designPattern.estructural.decorator.concretDecorator.SendSms;

public class DecoratorApplication {
    public static void main(String[]args){
        Notification notification = new SendEmail();

        notification = new SendPush(notification);

        notification = new SendSms(notification);

        System.out.println("Test Notification: " + notification);
    }
}
