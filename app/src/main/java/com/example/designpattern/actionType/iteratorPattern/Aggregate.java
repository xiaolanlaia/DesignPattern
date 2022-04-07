package com.example.designpattern.ActionType.iteratorPattern;

public interface Aggregate<T> {
    void add(T obj);
    void remove(T obj);
    Iterator<T> iterator();

}
