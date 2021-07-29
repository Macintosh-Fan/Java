package com.macintoshfan.abstraction.abstractclasses;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzz...");
    }

    public abstract void animalSound();
}
