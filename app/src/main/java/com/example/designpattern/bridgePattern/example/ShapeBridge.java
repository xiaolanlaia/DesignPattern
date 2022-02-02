package com.example.designpattern.bridgePattern.example;

public abstract class ShapeBridge {
    protected DrawAPI drawAPI;

    protected ShapeBridge(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
