package com.patterns.designPattern.behavioral.command.concretCommand;

import com.patterns.designPattern.behavioral.command.Command;
import com.patterns.designPattern.behavioral.command.receiver.LightBulb;

public class TurnOnLight implements Command {
    private LightBulb lightBulb;

    public TurnOnLight(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.turnOnLight();
    }
}
