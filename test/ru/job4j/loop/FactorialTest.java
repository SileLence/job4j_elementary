package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int actual = Factorial.calc(n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int actual = Factorial.calc(n);
        Assert.assertEquals(expected, actual);
    }
}
