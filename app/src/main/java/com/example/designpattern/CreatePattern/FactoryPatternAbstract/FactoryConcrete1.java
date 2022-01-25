package com.example.designpattern.CreatePattern.FactoryPatternAbstract;

public class FactoryConcrete1 extends FactoryAbstract{
    @Override
    public ProductAAbstract createProductA() {
        return new ProductAConcrete();
    }

    @Override
    public ProductBAbstract createProductB() {
        return new ProductBConcrete();
    }
}
