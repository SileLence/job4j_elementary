package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax5To8Then8() {
        int left = 5;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1ToMinus3Then1() {
        int left = 1;
        int right = -3;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when7Equals7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfThree() {
        int first = 9;
        int second = 0;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfFour() {
        int first = -2;
        int second = 6;
        int third = 3;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}
