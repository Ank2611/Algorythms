package com.sda.Algorythms;

public class FunctiaLaPatrat {
    public static void main ( String[] args ) {
        float a = 1;
        float b = 5;
        float c = 4;
        float delta = (float) (b * b - (4 * a * c));
        System.out.println("delta " + delta);
        if (delta > 0) {
            float x1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            float x2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
            System.out.println("Solutiile ecuatiei: x1= " + x1 + " si x2= " + x2);
        } else if (delta == 0) {
            float x1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            float x2 = x1;
            System.out.println("Solutiile ecuatiei: x1= " + x1 + " si x2= " + x2);
        } else {
            System.out.println("Ecuatia nu are solutii reale");
        }
    }
}
