package com.example.designpattern.proxyPattern;

public class ProxySubject extends Subject{
    private RealSubject realSubject;
    public ProxySubject(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void visit() {
        realSubject.visit();
    }
}