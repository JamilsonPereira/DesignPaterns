package com.patterns.designPattern.estructural.decorator.abstractDecorator;

import com.patterns.designPattern.estructural.decorator.Notification;

public abstract class NotificationDecorator implements Notification {

    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }


    public void sendNotification(String message){
        notification.sendNotification(message);
    }
}
