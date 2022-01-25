package com.example.designpattern.CreatePattern.FactoryPattern.learn;

public class FactoryConcrete extends Factory {
    @Override
    public Product createProduct() {
        return new ProductConcreteA();
    }
}
