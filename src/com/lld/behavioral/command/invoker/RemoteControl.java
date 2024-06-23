package com.lld.behavioral.command.invoker;

import com.lld.behavioral.command.command.Command;

import java.util.Stack;

public class RemoteControl {
    private final Stack<Command> commandHistory = new Stack<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
