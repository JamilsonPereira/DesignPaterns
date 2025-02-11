package com.patterns.designPattern.behavioral.command;

import com.patterns.designPattern.behavioral.command.concretCommand.TurnOffLight;
import com.patterns.designPattern.behavioral.command.concretCommand.TurnOnLight;
import com.patterns.designPattern.behavioral.command.invoker.RemoteControl;
import com.patterns.designPattern.behavioral.command.receiver.LightBulb;

import javax.crypto.spec.PSource;

public class Client {

    public static void main(String[]args){

        LightBulb lightBulb = new LightBulb();

        Command turnOnLigth = new TurnOnLight(lightBulb);
        Command turnOffLight = new TurnOffLight(lightBulb);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnLigth);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();

    }
}
