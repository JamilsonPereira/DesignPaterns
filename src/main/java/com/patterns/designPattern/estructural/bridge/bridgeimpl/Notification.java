package com.patterns.designPattern.estructural.bridge.bridgeimpl;

import com.patterns.designPattern.estructural.bridge.abstraction.MessageSender;

public abstract class Notification {

    public MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void sendMessage(String message);
}
