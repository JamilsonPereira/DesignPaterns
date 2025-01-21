package com.patterns.designPattern.estructural.bridge.bridgeimpl;

import com.patterns.designPattern.estructural.bridge.abstraction.MessageSender;

public class ReminderNotification extends Notification {
    public ReminderNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
   public void sendMessage(String message) {
        System.out.println("Reminder: " + message);
    }
}
