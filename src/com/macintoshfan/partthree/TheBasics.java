package com.macintoshfan.partthree;

public class TheBasics {
    public static void main(String[] args) {
        /*
        Primitive Type | Reference Type
        -------------------------------

                 TYPICAL USAGE
        -------------------------------
        -              |         String
        int            |        Integer
        double         |         Double
        boolean        |        Boolean
        char           |      Character
        -------------------------------

                  BONUS TYPES!
        -------------------------------
        float          |          Float
        byte           |           Byte
        short          |          Short
        long           |           Long
         */
        // Variables (common and simple usage)
        String myString = "Learn Java today!";
        int myInt = 10 / 2 + 3;
        double myDouble = 3.14 * 2;
        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;
        char myChar = 'm';

        String[] myStringArray = {"One", "Two", "Three"};
        int[] myIntArray = {1, 2, 3};
        Object[] myObjectArray = {1, 2, 3, "four", true, 'x'};

        // Printing above variables
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myBooleanTrue);
        System.out.println(myBooleanFalse);
        System.out.println(myChar);

        System.out.println(myStringArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myObjectArray[myObjectArray.length - 1]);

        // Variables (reference types)
        String refString = "Learn Java today!";
        Integer refInteger = 10 / 2 + 3;
        Double refDouble = 3.14;
        Boolean refBooleanTrue = true;
        Boolean refBooleanFalse = false;
        Character refCharacter = 'm';
        Float refFloat = 3.14f * 2;
        Byte refByte = 127;  // Max Highest Number
        Short refShort = 32767;  // Max Highest Number
        Long refLong = 9223372036854775807L;  // Max Highest Number

        // Variables (primitive types)
        int primInteger = 10 / 2 + 3;
        double primDouble = 3.14;
        boolean primBooleanTrue = true;
        boolean primBooleanFalse = false;
        char primCharacter = 'm';
        float primFloat = 3.14f * 2;
        byte primByte = 127;  // Max Highest Number
        short primShort = 32767;  // Max Highest Number
        long primLong = 9223372036854775807L;  // Max Highest Number
    }
}
