package com.example.designpattern.CreateType.FactoryPattern.example;

public class FactoryAnimalConcrete extends FactoryAnimal {
    @Override
    public Animal createAnimal() {
        return new AnimalCat();
    }
}
