package com.macintoshfan.objects;

import java.awt.Color;
import java.util.Map;

/**
 * A program to demonstrate basic OOP (object-oriented programming) in Java.
 *
 * @author Macintosh_Fan
 */
public class ObjectExample {
    /**
     * The main method.
     *
     * @param args does nothing
     */
    public static void main(String[] args) {
        // Create the object and use it
        Person john = new Person("John", 15, Color.GREEN);
        john.introduce();

        // Get a key-value set of the attributes of John
        Map<String, Object> johnInfo = john.getInfo();
        System.out.println(johnInfo);

        // OPTIONAL: print the String representation of the class
        printPerson(john);
    }

    /**
     * Prints the {@link String} representation of a {@link Person} object.
     *
     * @param person The person
     * @author Macintosh_Fan
     * @see Person#toString()
     */
    private static void printPerson(Person person) {
        System.out.println(person);
    }
}
