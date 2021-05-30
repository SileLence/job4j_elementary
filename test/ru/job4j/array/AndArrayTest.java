package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndArrayTest {

    @Test
    public void test() {
        assertArrayEquals(new int[] {}, AndArray.and(new int[] {1, 2, 3}, new int[] {4, 5}));
        assertArrayEquals(new int[] {1}, AndArray.and(new int[] {1, 2, 3}, new int[] {1, 4, 5}));
        assertArrayEquals(new int[] {4, 5}, AndArray.and(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5}));
        assertArrayEquals(new int[] {1, 7}, AndArray.and(new int[] {1, -3, 7}, new int[] {5, 7, 2, 4, 8, 9, -2, 1}));
    }
}
