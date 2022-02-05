package com.example.designpattern.ActionType.visitorPattern.learn;

public interface Visitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
