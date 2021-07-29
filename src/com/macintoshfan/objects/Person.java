package com.macintoshfan.objects;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * A class to create a {@link Person} object.
 *
 * @author Macintosh_Fan
 */
public class Person {
    public final String name;
    public int age;
    public Color favoriteColor;

    /**
     * The constructor.
     *
     * @param name          The person's name
     * @param age           The person's age
     * @param favoriteColor The person's favorite color
     * @author Macintosh_Fan
     */
    public Person(String name, int age, Color favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    /**
     * Introduces the person.
     *
     * @author Macintosh_Fan
     */
    public void introduce() {
        System.out.println("Hello! My name is " + name + " and I'm " + age + " years old.");
    }

    /**
     * @return A {@link Map} representation of the {@link Person} object
     * @author Macintosh_Fan
     */
    public Map<String, Object> getInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("Name", name);
        info.put("Age", age);
        info.put("Favorite color", favoriteColor);
        return info;
    }

    /**
     * @return A {@link Map} representation of the {@link Person} object as a {@link String}
     * @author Macintosh_Fan
     */
    @Override
    public String toString() {
        return getInfo().toString();
    }
}
