package com.example.designpattern.CreatePattern.FactoryPattern.example;

public class FactoryAnimalConcrete extends FactoryAnimal {
    @Override
    public Animal createAnimal() {
        return new AnimalCat();
    }
}
