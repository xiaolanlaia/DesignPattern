package com.example.designpattern.decorator.learn;

public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
