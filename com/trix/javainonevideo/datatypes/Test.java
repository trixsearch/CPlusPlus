package com.trix.javainonevideo.datatypes;

public class Test {
    public static void main(String[] args) {
        System.out.println("We are Learning Data types \n"+"=".repeat(30));

        System.out.println("Byte ki range: ");
        byte minByte=-128;
        System.out.println("minimum value of a byte :"+minByte);
        System.out.println("minimum value of a byte :"+Byte.MIN_VALUE);
        byte maxByte=127;
        System.out.println("maximum value of a byte :"+maxByte);

        System.out.println("\nShort ki range: ");
        System.out.println("minimum value of a short :"+ Short.MIN_VALUE);
        System.out.println("maximum value of a short :"+Short.MAX_VALUE);

        System.out.println("\nInteger ki range");
        System.out.println("minimum value of a Integer :"+ Integer.MIN_VALUE);
        System.out.println("maximum value of a Integer :"+Integer.MAX_VALUE);

        System.out.println("\nLong ki range");
        System.out.println("minimum value of a Long :"+ Long.MIN_VALUE);
        System.out.println("maximum value of a Long :"+Long.MAX_VALUE);

        long longNumberExample = 12435675242l;

        System.out.println("We use L or l in the last of long number"+ longNumberExample);

        System.out.println("\n"+"-".repeat(30));
        System.out.println("Storing Decimals in data types: Float, Double");
        System.out.println("\nFloat");

        float floatNumberExample=12.123456783f;
        System.out.println("Float can store 7 significant digits:"+floatNumberExample);
        System.out.println("See how the 6th digit is turned into round off,if you add more digits into it");
        System.out.println("\nFloat ki range");
        System.out.println("minimum value of a Float :"+ Float.MIN_VALUE+" || They can be both positive and negative");
        System.out.println("maximum value of a Float :"+Float.MAX_VALUE+" || They can be both positive and negative");

        System.out.println("\nDouble");
        double doubleNumberExample=12.1234567891234566;
        System.out.println("Double can store 7 significant digits:"+doubleNumberExample);
        System.out.println("See how the 15th digit is turned into round off,if you add more digits into it");
        System.out.println("\nFloat ki range");
        System.out.println("minimum value of a Double :"+ Double.MIN_VALUE+" || They can be both positive and negative");
        System.out.println("maximum value of a Double :"+Double.MAX_VALUE+" || They can be both positive and negative");

        // converting Int to long is widening conversion ,which can be done easily
        // vice versa doing narrowing conversion or explicit conversion will be data loss

//        Non-primitive types are created by the programmer (except for String, which is predefined but still non-primitive). They refer to objects.
//
//        Memory: The actual object is stored on the Heap, while the reference (the address) is stored on the Stack.
//
//                Default Values: Their default value is null.
//
//                Methods: Unlike primitives, you can call methods on non-primitive types to perform operations.
//
//        Common Examples:
//
//        Strings: String name = "Java";
//
//        Arrays: int[] numbers = {1, 2, 3};
//
//        Classes: Any class you define (like your AdditionMagic class).
//
//        Interfaces: Blueprints for classes.
        System.out.println("\nAbove All are PRIMITIVE Data types");
    }
}
