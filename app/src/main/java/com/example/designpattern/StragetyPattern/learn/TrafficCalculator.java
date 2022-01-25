package com.example.designpattern.StragetyPattern.learn;

public class TrafficCalculator {
    CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int calculatePrice(int km){
        return calculateStrategy.calculatePrice(km);
    }
}