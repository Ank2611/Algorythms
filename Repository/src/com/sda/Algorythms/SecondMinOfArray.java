package com.sda.Algorythms;

import java.util.Arrays;

public class SecondMinOfArray{
    public static void main ( String[] args ){
        int[] my_array = {25, 14, 56, 15, 36, 49, 18, 29, 78};

        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i < my_array.length; i++) {
            //System.out.println(my_array[i]);
            if (my_array[i] == min) {
//                System.out.println("array[i] " + my_array[i] + " == " + min);
//                System.out.println(second_min);
                second_min = min;
            } else if (my_array[i] < min) {
//                System.out.println("array[i] " + my_array[i] + " < " + min);
//                System.out.println("my array " + my_array[i]);
                second_min = min;
//                System.out.println("sec min " + second_min);
                min = my_array[i];
//                System.out.println("min " + min);
            } else if (my_array[i] < second_min) {
                //System.out.println(my_array[i]);
                second_min = my_array[i];
//                System.out.println(second_min);
            }

        }
        System.out.println("Second lowest number is : " + second_min);
    }
}
