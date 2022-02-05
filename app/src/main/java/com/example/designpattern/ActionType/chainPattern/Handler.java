package com.example.designpattern.ActionType.chainPattern;

public abstract class Handler {
    public Handler successor;
    public abstract void handleRequest(String condition);
}
