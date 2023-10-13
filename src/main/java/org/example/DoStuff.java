package org.example;

public class DoStuff {

    static int y;

    public static void main(String[] args) {
        System.out.println("I did it!");

        // this is static bcuz it is italic & it is in same class
        somethingElse();

        // y is static variable, so we can call it from static main
        y = 12;
    }

    public static void somethingElse() {
        System.out.println("print something");
    }
}
