package com.amigoscode.countLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public void countEachLetter(String input) {
        char[] alphabet = "abcdefghijklmnopqrstuwxyz".toCharArray();
        Map<String, Integer> characterMap = new HashMap<>();
        for (char c : alphabet) {
            String d = Character.toString(c);
            characterMap.put(d, 0);
        }
        for (char x : input.toCharArray()) {
            String y = Character.toString(x);
            if (characterMap.containsKey(y)) {
                characterMap.put(y, characterMap.get(y) + 1);
            }
        }

        boolean containsLetters = false;

        for (String key : characterMap.keySet()) {
            if (!characterMap.get(key).equals(0)) {
                System.out.println(key + " appears " + characterMap.get(key) + " time(s) in " + "\"" + input + "\"");
                containsLetters = true;
            }
        }
        if (!containsLetters) {
            System.out.println("\"" + input + "\"" + " contains no letters");
        }

    }
}
