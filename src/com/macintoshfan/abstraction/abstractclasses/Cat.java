package com.macintoshfan.abstraction.abstractclasses;

import java.awt.Color;

public class Cat extends Animal implements Crazy {
    public Color furColor;

    public Cat(String name, Color furColor) {
        super(name);
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println("Meow++!");
    }

    @Override
    public void animalSound() {
        System.out.println("Meow!");
    }

    @Override
    public void goCrazy() {
        System.out.println("The cat goes crazy!");
    }
}
