package com.example.designpattern.visitorPattern.learn;

public interface Visitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
