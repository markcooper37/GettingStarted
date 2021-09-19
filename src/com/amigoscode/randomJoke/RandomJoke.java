package com.amigoscode.randomJoke;

import java.util.Random;
import java.util.Scanner;

public class RandomJoke {

      public void randomJoke() {
        String joke1 = "Why did the teddy bear say no to dessert? Because he was stuffed!";
        String joke2 = "What did the left eye say to the right eye? Between us, something smells!";
        String joke3 = "What is brown, hairy and wears sunglasses? A coconut on vacation!";
        String[] jokes = new String[]{joke1, joke2, joke3};

        Scanner scanner = new Scanner(System.in);
        boolean yn = true;
        while(yn) {
            System.out.println("Would you like to hear a joke?");
            String answer = scanner.nextLine();
            switch (answer) {
                case "yes" -> {
                    int randomNumber = new Random().nextInt(3);
                    System.out.println(jokes[randomNumber]);
                    yn = false;
                }
                case "no" -> yn = false;
                default -> {
                    System.out.println("Please enter either yes or no");
                }
            }
        }
    }

}
