package com.amigoscode.numberList;

import java.util.ArrayList;

public class NumberListFunctions {

    public int addNumbers(int[] intArray) {
        int sum = 0;
        for (int i : intArray) {
            sum = sum + i;
        }
        return sum;
    }

    public int findBiggest(int[] intArray) {
        int biggest = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > biggest) {
                biggest = intArray[i];
            }
        }
        return biggest;
    }

    public int[] mergeSortedLists(int[] intArray1, int[] intArray2) {
        int numberInLists = intArray1.length + intArray2.length;
        int counter = 0;
        int intArray1Ref = 0;
        int intArray2Ref = 0;
        int[] newList = new int[numberInLists];
        while (counter < numberInLists) {
            if (intArray1Ref == intArray1.length) {
                newList[counter] = intArray2[intArray2Ref];
                intArray2Ref = intArray2Ref + 1;
            } else if (intArray2Ref == intArray2.length) {
                newList[counter] = intArray1[intArray1Ref];
                intArray1Ref = intArray1Ref + 1;
            } else if (intArray1[intArray1Ref] < intArray2[intArray2Ref]) {
                newList[counter] = intArray1[intArray1Ref];
                intArray1Ref = intArray1Ref + 1;
            } else {
                newList[counter] = intArray2[intArray2Ref];
                intArray2Ref = intArray2Ref + 1;
            }
            counter++;
        }
        return newList;
    }

}
