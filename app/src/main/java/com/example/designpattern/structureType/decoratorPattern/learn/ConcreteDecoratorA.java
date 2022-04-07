package com.example.designpattern.StructureType.decoratorPattern.learn;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    public void operateA(){

    }

    public void operateB(){

    }
}
