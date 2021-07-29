package com.macintoshfan.generics;

/**
 * A simple program to demonstrate simple usage of generics in Java.
 *
 * @author Macintosh_Fan
 */
public class GenericsExample {
    /**
     * The main method.
     * @param args does nothing
     */
    public static void main(String[] args) {
        GenericsClass<String> myString = new GenericsClass<>("Some text.");
        myString.setObj("Updated text.");
        System.out.println(myString.getObj());

        GenericsClass<Integer> myInteger = new GenericsClass<>(68);
        myInteger.setObj(20);
        System.out.println(myInteger.getObj());
    }
}
