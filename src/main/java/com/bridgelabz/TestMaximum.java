package com.bridgelabz;
public class TestMaximum{

    public static Integer integerMax(Integer x, Integer y, Integer z) {
        int max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static Double doubleMax(Double x, Double y, Double z) {
        double max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}
