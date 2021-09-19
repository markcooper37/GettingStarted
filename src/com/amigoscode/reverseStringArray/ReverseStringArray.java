package com.amigoscode.reverseStringArray;

public class ReverseStringArray {

    public String[] reverse(String[] array) {
        int len = array.length - 1;
        String[] newStrings = new String[array.length];
        for (int i = len; i >= 0; i--) {
            newStrings[i] = array[len - i];
        }
        return newStrings;
    }

}
