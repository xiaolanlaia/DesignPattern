package com.example.designpattern.actionType.commandPattern.learn;

public class ConcreteCommand implements Command{
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
