package com.example.designpattern.createType.FactoryPattern.example;

public class FactoryAnimalConcrete extends FactoryAnimal {
    @Override
    public Animal createAnimal() {
        return new AnimalCat();
    }
}
