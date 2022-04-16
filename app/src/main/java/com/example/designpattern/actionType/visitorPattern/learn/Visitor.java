package com.example.designpattern.actionType.visitorPattern.learn;

public interface Visitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
