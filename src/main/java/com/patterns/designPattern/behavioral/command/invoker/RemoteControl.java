package com.patterns.designPattern.behavioral.command.invoker;

import com.patterns.designPattern.behavioral.command.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
