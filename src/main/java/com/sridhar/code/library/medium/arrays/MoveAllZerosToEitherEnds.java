package com.sridhar.code.library.medium.arrays;

public class MoveAllZerosToEitherEnds {


    public int[] moveZerosToBeginning(int[] array) {
        int i = array.length-1;
        int movingIndex = i;
        while(movingIndex >= 0) {
            if(array[movingIndex] != 0) {
                array[i] = array[movingIndex];
                movingIndex = movingIndex - 1;
                i = i - 1;
            } else {
                movingIndex = movingIndex - 1;
            }
        }

        for(int j = 0; j <= i; j++) {
            array[j] = 0;
        }
        return array;
    }

    public int[] moveZerosToEnd(int[] array) {
        int i = 0;
        int movingIndex = i;
        while(movingIndex < array.length) {
            if(array[movingIndex] != 0) {
                array[i] = array[movingIndex];
                movingIndex = movingIndex + 1;
                i = i + 1;
            } else {
                movingIndex = movingIndex + 1;
            }
        }

        for(int j = i; j < array.length; j++) {
            array[j] = 0;
        }
        return array;
    }
}
