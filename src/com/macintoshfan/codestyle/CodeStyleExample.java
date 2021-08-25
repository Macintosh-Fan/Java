package com.macintoshfan.codestyle;

import com.macintoshfan.abstraction.abstractclasses.Animal;

/**
 * Code style in Java and the way Macintosh_Fan does it.
 * Some code is standard Java convention, such as class names, variable names, method names, and sometimes spacing/indentation (4 spaces).
 * For other minor details, such as spacing, curly braces, it's more about personal preference.
 * Note that there is Javadoc around the code to let you know how things work; optional for you to write.
 * <p>
 * Now, take a look around this file to get an idea of code style.
 *
 * @author Macintosh_Fan
 * @see <a href="https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html">Code Conventions for the Java Programming Language: 1. Introduction</a>
 */
public class CodeStyleExample {
    /**
     * A constant (final variable/field) with more than one word.
     */
    static final int ROUND_TO = 1;
    /**
     * A constant (final variable/field) with one word.
     */
    static final String NAME = "Macintosh_Fan";

    /**
     * A field with more than one word.
     */
    static int programAge = 0;
    /**
     * A field with one word.
     */
    static int number = 15;

    /**
     * A method (main method here).
     *
     * @param args does nothing
     */
    public static void main(String[] args) {
        System.out.println("My name is: " + NAME);

        programAge++;
        if (programAge == 1) {
            System.out.println("A year has passed. The program is now " + programAge + " year old.");
        } else {
            System.out.println("A year has passed. The program is now " + programAge + " years old.");
        }

        number--;
        double newNumber = Math.sqrt(number) * ((double) (1 / 2) * programAge);
        String formatString = "The new number is here (rounded): %." + ROUND_TO + 'f';
        String result = String.format(formatString, newNumber);
        System.out.println(result);

        Animal crow = new Animal("Fred") {
            @Override
            public void animalSound() {
                System.out.printf("%s squawks.\n", name);
            }
        };
        crow.animalSound();

        String[] names = {"Jeffrey", "George", "John"};
        for (String name : names) {
            if (name.equals(names[0])) {
                System.out.println();
            }
            System.out.println(name);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Counting. i=" + i);
        }

        int j = 3;
        do {
            j--;
            System.out.println("Counting down in do-while loop. j=" + j);
        } while (j > 0);
    }
}
