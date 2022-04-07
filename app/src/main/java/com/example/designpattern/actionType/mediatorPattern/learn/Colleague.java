package com.example.designpattern.ActionType.mediatorPattern.learn;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void action();
}
