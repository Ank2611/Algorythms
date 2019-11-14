package com.sda.Algorythms;

import java.util.Arrays;

public class ReverseArray {
    public static void main ( String[] args ) {
        int[] myArray = {2,33,221,3,4};
        System.out.println("Original array: " + Arrays.toString(myArray));
        int len = myArray.length;
        for (int i = 0; i< len/2; i++){
            //se fol met paharelor
            int j = myArray[i];
            myArray[i] = myArray[len-1-i];
            myArray[len-1-i]=j;
            //System.out.println("new array: " + Arrays.toString(myArray));
        }

        System.out.println("Reverse array: " + Arrays.toString(myArray));
    }
}
