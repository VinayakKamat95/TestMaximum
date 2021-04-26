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
}
