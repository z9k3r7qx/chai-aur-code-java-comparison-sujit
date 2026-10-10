package _01_basics;

import java.math.BigInteger;
import java.util.Arrays;

public class practice {

    // JS object { name, age } -> a class (or a Map)
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {

        // ---------- Primitive types ----------
        // JS has 7 primitives. Java has 8: byte, short, int, long, float, double, char, boolean

        final int score = 100;                    // const -> final
        final double scoreValue = 100.3;          // JS "number" splits into int / double (and more)

        final boolean isLoggedIn = false;

        // null and undefined: Java has only null, and it works only on reference types (not int, boolean...)
        final String outsideTemp = null;          // String is NOT a primitive in Java, it is a reference type
        String userEmail = null;                  // "let userEmail;" -> must assign (null) before using

        // Symbol -> no direct equivalent. A new Object() is always unique, which is the same idea.
        final Object id = new Object();
        final Object anotherId = new Object();
        System.out.println(id == anotherId);      // false (different objects, like two Symbols)

        // BigInt -> long if it fits, BigInteger if it is bigger
        long bigNumber = 3456543576654356754L;    // fits in long (needs L at the end)
        BigInteger reallyBig = new BigInteger("345654357665435675434565435");

        // ---------- Reference (non-primitive) types ----------
        // Array, Objects, Functions

        String[] heros = {"shaktiman", "naagraj", "doga"};
        System.out.println(Arrays.toString(heros));       // [shaktiman, naagraj, doga]

        Person myObj = new Person("hitesh", 22);
        System.out.println(myObj.name + " " + myObj.age);  // hitesh 22

        // Function stored in a variable -> lambda + functional interface
        Runnable myFunction = () -> System.out.println("Hello world");
        myFunction.run();                                  // Hello world

        // typeof anotherId -> getClass()
        System.out.println(anotherId.getClass().getName());   // java.lang.Object
        //added files
    }
}
