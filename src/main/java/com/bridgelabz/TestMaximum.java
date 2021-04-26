package com.bridgelabz;
public class TestMaximum{

    public static Integer integerMax(Integer xInt, Integer yInt, Integer zInt) {
        int max = xInt;
        if(yInt.compareTo(max) > 0){
            max = yInt;
        }
        if(zInt.compareTo(max) > 0){
            max = zInt;
        }
        return max;
    }

    public static Double doubleMax(Double xFlt, Double yFlt, Double zFlt) {
        double max = xFlt;
        if(yFlt.compareTo(max) > 0){
            max = yFlt;
        }
        if(zFlt.compareTo(max) > 0){
            max = zFlt;
        }
        return max;
    }
    /*Method to Check Max String */
    public static String stringMax(String xStr, String yStr, String zStr) {
        String max = xStr;
        if(yStr.compareTo(max) > 0){
            max = yStr;
        }
        if(zStr.compareTo(max) > 0){
            max = zStr;
        }
        return max;
    }
}
