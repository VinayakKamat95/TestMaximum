package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class TestMaximumTest {
    TestMaximum testMaximum;


    @Test
    public void maxInteger() {
        int vales = testMaximum.maximum(33, 55, 4, 56, 77, 89);
        Assert.assertEquals(89, vales);
    }

    @Test
    public void maxDouble() {
        Comparable vales = testMaximum.maximum(33.0, 55.5, 4.4, 56.8, 77.2, 89.8);
        Assert.assertEquals(89.8, vales);
    }

    @Test
    public void maxString() {
        Comparable vales = testMaximum.maximum("Peach", "Apple", "Banana", "Grapes", "Mango");
        Assert.assertEquals("Peach", vales);
    }

}
