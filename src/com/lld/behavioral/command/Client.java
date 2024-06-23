package com.lld.behavioral.command;

import com.lld.behavioral.command.command.TurnACOnCommand;
import com.lld.behavioral.command.invoker.RemoteControl;
import com.lld.behavioral.command.receiver.AirConditioner;

public class Client {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnACOnCommand(airConditioner));

        // pressing the button
        remoteControl.pressButton();
        // undoing the command
        remoteControl.undo();
    }
}
