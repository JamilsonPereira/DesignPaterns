package com.patterns.designPattern.estructural.bridge;

import com.patterns.designPattern.estructural.bridge.abstraction.EmailMessage;
import com.patterns.designPattern.estructural.bridge.abstraction.SmsMessage;
import com.patterns.designPattern.estructural.bridge.bridgeimpl.AlertNotification;
import com.patterns.designPattern.estructural.bridge.bridgeimpl.Notification;
import com.patterns.designPattern.estructural.bridge.bridgeimpl.ReminderNotification;

public class BridgeApplication {
    public static void main(String[]args){
        Notification notificationEmail = new AlertNotification(new EmailMessage());
        Notification notificationSms = new ReminderNotification(new SmsMessage());

         notificationEmail.sendMessage("Task send");
         notificationSms.sendMessage("Reminder to pay tomorrow");
    }

}
