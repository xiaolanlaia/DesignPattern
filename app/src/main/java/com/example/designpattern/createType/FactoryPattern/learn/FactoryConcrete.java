package com.example.designpattern.createType.FactoryPattern.learn;

public class FactoryConcrete extends Factory {
    @Override
    public Product createProduct() {
        return new ProductConcreteA();
    }
}
