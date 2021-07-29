package com.macintoshfan.abstraction;

import com.macintoshfan.abstraction.abstractclasses.Animal;
import com.macintoshfan.abstraction.interfaces.Rectangle;
import com.macintoshfan.abstraction.interfaces.Shape;

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
        // Note that the program does not use all the classes and functionalities of each class/abstract class/interface

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

        Shape myRect = new Rectangle(4, 3);
        System.out.println("The area of the rectangle is " + (int) myRect.area() + "cm^2");
        myRect.draw();
    }
}
