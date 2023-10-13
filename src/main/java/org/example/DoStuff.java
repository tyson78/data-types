package org.example;

public class DoStuff {

    static int y;

    public static void main(String[] args) {

        // this is static bcuz it is italic & it is in same class
        somethingElse();

        // y is static variable, so we can call it from static main
        y = 12;

        String iDidIt = "I did it!";
        System.out.println(iDidIt.toUpperCase());

    }

    public static void somethingElse() {
        System.out.println("print something");
    }
}
