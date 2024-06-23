package com.lld.behavioral.command.command;

import com.lld.behavioral.command.receiver.AirConditioner;

public class TurnACOffCommand implements Command{
    private final AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
