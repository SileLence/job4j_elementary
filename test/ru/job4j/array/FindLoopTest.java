package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas45Then0() {
        int[] data = {7, 2, 0, 4, 1, 23, 10, 35, 45, 87, 49};
        int el = 45;
        int result = FindLoop.indexOf(data, el);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNoElementThenMinus1() {
        int[] data = {9, 1, 6, 33, 76, 12, 86, 11, 46, 19, 53};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
