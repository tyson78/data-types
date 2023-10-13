package org.example;

public class Main {
    static Apple sharedApple;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int howMany; // 32 bits (4 bytes)
        long howManyStars = 1000000000;
        short howManyPeople = 100;
        byte howManyApples = 20;
        char itsReallyCharacter;


        if (howManyPeople < howManyStars && howManyPeople < howManyApples) {
            System.out.println("Everybody gets a star!");
            System.out.println("...and an APPLE!");
        }
        else {
            System.out.println("... but NOT an APPLE");
        }
        // Arithmetic
        // Logical
            // && || !
        // Numeric comparisons produce boolean result
            // < > == != <= >=
        // Increment and decrement
            // ++ --
        // exam question
        howMany = 15;
        System.out.println(howMany);
        System.out.println(++howMany);
        System.out.println(howMany++);

        int minusTest = 3;
        System.out.println(minusTest);
        System.out.println(--minusTest);
        System.out.println(minusTest--);

        /*
        if (longString.length() < shortString.length()) {
            System.out.println("The world is upside down...");
        }
         */

        Apple a = new Apple();
        Apple b = new Apple(1,"Crabapple", "Reddish-pink","Early August");

        System.out.println(a);
        System.out.println(b);

        Apple myApples[] = new Apple[3];
        myApples[0] = new Apple(1, "Crabapple", "Reddish-pink","Early August");
        myApples[1] = new Apple(.5f, "RootenApple", "", "");
        myApples[2] = new Apple(1.5f, "Crabapple", "Reddish-pink", "Early August");

        // for-each loop
        for (Apple apple : myApples) {
            if (!apple.variety.equals("RottenApple")) continue;
            System.out.println(apple);
        }

        // for loop
        for (int i = 0; i < myApples.length; i++) {
            System.out.println(myApples[i]);
        }

    }
}

