package com.amigoscode.numberList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        NumberListFunctions nlf = new NumberListFunctions();

        int[] numList = new int[]{56, 65, 146, 333};
        int[] numList2 = new int[]{13, 98, 128, 199, 346, 875};
        System.out.println(nlf.addNumbers(numList));
        System.out.println(nlf.findBiggest(numList));
        System.out.println(Arrays.toString(nlf.mergeSortedLists(numList, numList2)));

    }

}
