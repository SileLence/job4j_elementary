package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort3Elements() {
        int[] array = {7, 2, 5};
        int[] expected = {2, 5, 7};
        int[] actual = SortSelected.sort(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSort5Elements() {
        int[] array = {0, 7, 2, 5, 4};
        int[] expected = {0, 2, 4, 5, 7};
        int[] actual = SortSelected.sort(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSort15Elements() {
        int[] array = {-6, 45, -1, 0, 7, -2, 5, 4, 11, 30, 3, 13, -21, 5, 1};
        int[] expected = {-21, -6, -2, -1, 0, 1, 3, 4, 5, 5, 7, 11, 13, 30, 45};
        int[] actual = SortSelected.sort(array);
        Assert.assertArrayEquals(expected, actual);
    }
}
