package com.macintoshfan.abstraction.interfaces;

public class Rectangle implements Shape {
    public int length;
    public int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("The rectangle has been drawn!");
    }

    @Override
    public double area() {
        return length * height;
    }
}
