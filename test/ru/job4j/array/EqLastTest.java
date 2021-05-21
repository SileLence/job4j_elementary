package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 82, 3, 6, 26, 12};
        int[] right = {94, 14, 65, 4, 8, 98, 2, 12};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 82, 3, 6, 26, 12};
        int[] right = {94, 14, 65, 4, 8, 98, 2};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}
