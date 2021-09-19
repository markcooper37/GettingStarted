package com.amigoscode.reverseStringArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ReverseStringArray rsa = new ReverseStringArray();

        String[] testWords = new String[]{"hello", "goodbye"};
        String[] check = rsa.reverse(testWords);
        System.out.println(Arrays.toString(check));


    }

}
