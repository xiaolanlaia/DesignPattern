package com.example.designpattern.CreateType.FactoryPattern.learn;

public class FactoryConcrete extends Factory {
    @Override
    public Product createProduct() {
        return new ProductConcreteA();
    }
}
