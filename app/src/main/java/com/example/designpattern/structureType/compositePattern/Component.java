package com.example.designpattern.StructureType.compositePattern;

public abstract class Component {
    protected String name;
    public Component(String name){
        this.name = name;
    }

    public abstract void doSomething();
}
