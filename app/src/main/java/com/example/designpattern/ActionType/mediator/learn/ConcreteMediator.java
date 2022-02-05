package com.example.designpattern.ActionType.mediator.learn;

public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}
