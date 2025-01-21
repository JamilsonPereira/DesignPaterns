package com.patterns.designPattern.estructural.bridge.bridgeimpl;

import com.patterns.designPattern.estructural.bridge.abstraction.MessageSender;

public class AlertNotification extends Notification{
    public AlertNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Alert: " + message);
    }


}
