package com.example.designpattern.chainPattern;

public abstract class Handler {
    public Handler successor;
    public abstract void handleRequest(String condition);
}
