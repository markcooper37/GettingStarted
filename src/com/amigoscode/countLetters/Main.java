package com.amigoscode.countLetters;

public class Main {

    public static void main(String[] args) {

        CountLetters cl = new CountLetters();

        cl.countEachLetter("banana, bread, cheese");
        cl.countEachLetter("");
        cl.countEachLetter("//.;'['.;,]");

    }

}
