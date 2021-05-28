package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RightDiagonalTest {

    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {3, 5, 7};
        assertArrayEquals(expected, RightDiagonal.diagonal(data));
    }

    @Test
    public void test2() {
        int[][] data = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {9, 8, 7, 6, 5},
                {1, 3, 2, 4, 5},
                {2, 4, 1, 3, 5}
        };
        int[] expected = {5, 2, 7, 3, 2};
        assertArrayEquals(expected, RightDiagonal.diagonal(data));
    }

}
