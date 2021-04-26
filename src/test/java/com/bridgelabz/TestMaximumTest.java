package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {
    TestMaximum testMaximum;

    @Before
    public void setUp() throws Exception {
        testMaximum = new TestMaximum();
    }

    @Test
    public void MaxAtFirstPlaceInteger() {
        int vales = testMaximum.integerMax(55,33,4);
        Assert.assertEquals(55, vales);
    }

    @Test
    public void MaxAtSecondPlaceInteger() {
        int vales = testMaximum.integerMax(33,55,4);
        Assert.assertEquals(55, vales);
    }

    @Test
    public void MaxAtThirdPlaceInteger() {
        int vales = testMaximum.integerMax(33,4,55);
        Assert.assertEquals(55, vales);
    }

    @Test
    public void MaxAtFirstPlaceDouble() {
        double vales = testMaximum.doubleMax(55.0,33.2,4.8);
        Assert.assertEquals(55.0, vales, 0);
    }

    @Test
    public void MaxAtSecondPlaceDouble() {
        double vales = testMaximum.doubleMax(33.2,55.0,4.8);
        Assert.assertEquals(55.0, vales, 0);
    }

    @Test
    public void MaxAtThirdPlaceDouble() {
        double vales = testMaximum.doubleMax(33.2,4.8,55.0);
        Assert.assertEquals(55.0, vales, 0);
    }

    @Test
    public void MaxAtFirstPlaceString() {
        String vales = testMaximum.stringMax("Banana","Apple","Peach");
        Assert.assertEquals("Peach", vales);
    }

    @Test
    public void MaxAtSecondPlaceString() {
        String vales = testMaximum.stringMax("Apple","Banana","Peach");
        Assert.assertEquals("Peach", vales);
    }

    @Test
    public void MaxAtThirdPlaceString() {
        String vales = testMaximum.stringMax("Apple","Peach","Banana");
        Assert.assertEquals("Peach", vales);
    }
}
