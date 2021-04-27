package com.bridgelabz;
public class TestMaximum{
    /* Generic Method to Check Max Integer, Double, String*/
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}
