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
    public void MaxAtFirstPlace() {
        int vales = testMaximum.integerMax(55,33,4);
        Assert.assertEquals(55, vales);
    }
}
