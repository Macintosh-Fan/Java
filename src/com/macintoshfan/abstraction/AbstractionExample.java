package com.macintoshfan.abstraction;

import com.macintoshfan.abstraction.abstractclasses.Animal;
import com.macintoshfan.abstraction.abstractclasses.Cat;

import java.awt.Color;

/**
 * A simple program to demonstrate the usage of basic abstraction in Java.
 *
 * @author Macintosh_Fan
 */
public class AbstractionExample {
    /**
     * The main method.
     * @param args does nothing
     */
    public static void main(String[] args) {
        Animal myDog = new Animal("John") {
            @Override
            public void animalSound() {
                System.out.println("Bark!");
            }
        };
        System.out.println("The dog's name is: " + myDog.name);
        myDog.animalSound();
        myDog.sleep();

        System.out.println();

        Animal myCat = new Cat("Toffee", new Color(106, 67, 46));
        if (myCat instanceof Cat /* Always true in this instance */) {
            System.out.println(((Cat) myCat).furColor);
            ((Cat) myCat).goCrazy();
        }
        myCat.animalSound();
    }
}
