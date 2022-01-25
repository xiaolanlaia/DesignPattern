package com.example.designpattern.CreatePattern.BuilderPattern.learn;

public abstract class Builder {
    public abstract void builderBoard(String board);
    public abstract void builderDiaplay(String diaplay);
    public abstract void builderOS();
    public abstract Computer create();
}
