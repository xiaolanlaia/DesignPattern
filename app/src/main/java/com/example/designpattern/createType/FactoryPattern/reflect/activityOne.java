package com.example.designpattern.CreateType.FactoryPattern.reflect;

public class activityOne extends Product{
    private String stock;

    @Override
    public String toString() {
        return "activityOne{" +
                "stock='" + stock + '\'' +
                '}';
    }
}
