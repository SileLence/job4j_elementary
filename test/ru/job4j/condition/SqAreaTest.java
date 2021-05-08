package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Square1() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double actual = SqArea.square(p, k);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double actual = SqArea.square(p, k);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void whenP98K76Square30() {
        int p = 98;
        int k = 76;
        double expected = 30.7;
        double actual = SqArea.square(p, k);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void whenP13K57Square07() {
        int p = 13;
        int k = 57;
        double expected = 0.7;
        double actual = SqArea.square(p, k);

        Assert.assertEquals(expected, actual, 0.1);
    }
}
