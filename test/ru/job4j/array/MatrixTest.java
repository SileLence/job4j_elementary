package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when3on3() {
        int size = 3;
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        int[][] actual = Matrix.multiply(size);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void when4on4() {
        int size = 4;
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        int[][] actual = Matrix.multiply(size);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void when9on9() {
        int size = 9;
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 4, 6, 8, 10, 12, 14, 16, 18},
                {3, 6, 9, 12, 15, 18, 21, 24, 27},
                {4, 8, 12, 16, 20, 24, 28, 32, 36},
                {5, 10, 15, 20, 25, 30, 35, 40, 45},
                {6, 12, 18, 24, 30, 36, 42, 48, 54},
                {7, 14, 21, 28, 35, 42, 49, 56, 63},
                {8, 16, 24, 32, 40, 48, 56, 64, 72},
                {9, 18, 27, 36, 45, 54, 63, 72, 81}
        };
        int[][] actual = Matrix.multiply(size);
        Assert.assertArrayEquals(expected, actual);
    }
}
