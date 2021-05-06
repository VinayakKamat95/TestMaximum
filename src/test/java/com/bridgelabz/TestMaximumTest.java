package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class TestMaximumTest {
    TestMaximum testMaximum;

    @Test
    public void maxAtFirstPlaceInteger() {
        Comparable maximum = new TestMaximum(55, 33, 4).maximum();
        Assert.assertEquals(55, maximum);
    }

    @Test
    public void maxAtSecondPlaceInteger() {
        Comparable maximum = new TestMaximum(33,55,4).maximum();
        Assert.assertEquals(55, maximum);
    }

    @Test
    public void maxAtThirdPlaceInteger() {
        Comparable maximum = new TestMaximum(33, 4, 55).maximum();
        Assert.assertEquals(55, maximum);
    }

    @Test
    public void maxAtFirstPlaceDouble() {
        Comparable maximum = new TestMaximum(55.0,33.2,4.8).maximum();
        Assert.assertEquals(55.0, maximum);
    }

    @Test
    public void maxAtSecondPlaceDouble() {
        Comparable maximum = new TestMaximum(33.2,55.0,4.8).maximum();
        Assert.assertEquals(55.0, maximum);
    }

    @Test
    public void maxAtThirdPlaceDouble() {
        Comparable maximum = new TestMaximum(33.2,4.8,55.0).maximum();
        Assert.assertEquals(55.0, maximum);
    }

    @Test
    public void maxAtFirstPlaceString() {
        Comparable maximum = new TestMaximum("Peach","Apple","Banana").maximum();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void maxAtSecondPlaceString() {
        Comparable maximum = new TestMaximum("Apple","Peach","Banana").maximum();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void maxAtThirdPlaceString() {
        Comparable maximum = new TestMaximum("Apple","Banana","Peach").maximum();
        Assert.assertEquals("Peach", maximum);
    }


    @Test
    public void maxInteger() {
        Comparable vales = testMaximum.maximum(33, 55, 4, 56, 77, 89);
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
