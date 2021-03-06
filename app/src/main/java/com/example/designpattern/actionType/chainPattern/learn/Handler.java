package com.example.designpattern.actionType.chainPattern.learn;

public abstract class Handler {
    public Handler successor;
    public abstract void handleRequest(String condition);
}
