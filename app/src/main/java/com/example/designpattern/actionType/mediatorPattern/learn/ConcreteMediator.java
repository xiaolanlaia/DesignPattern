package com.example.designpattern.actionType.mediatorPattern.learn;

public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}
