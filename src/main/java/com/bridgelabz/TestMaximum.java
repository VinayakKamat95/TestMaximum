package com.bridgelabz;


public class TestMaximum<T extends Comparable<T>>{
    T x,y,z;

    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
    return TestMaximum.maximum(x, y, z);
    }

    /* Generic Method to Check Max Integer, Double, String*/
    public static <T extends Comparable<T>> T maximum(T ...elements) {

        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
        }
}


