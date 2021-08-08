package com.macintoshfan.lambdas;

import java.util.Scanner;

public class AnonymousFunctionExample {
    public static void main(String[] args) {
        AnonymousFunction<Integer> ageFunction = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How old are you?\nEnter here: ");
            try {
                return scanner.nextInt();
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid number.");
            }
            return null;
        };

        if (ageFunction.get() != null) {
            System.out.println("You're " + ageFunction.get() + " years old!");
        } else {
            System.out.println("Null check failed.");
        }
    }
}
