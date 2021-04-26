package com.bridgelabz;

public class TestMaximum <T extends Comparable<T>>{
    T x, y, z;
    public  TestMaximum(){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public T integerMax(){
        return  TestMaximum.integerMax(x, y, z);
    }

    public static <T extends Comparable<T>> T integerMax(T x, T y, T z) {
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
