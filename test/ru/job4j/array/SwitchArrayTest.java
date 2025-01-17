package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2To9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int source = 2;
        int dest = 9;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 10, 4, 5, 6, 7, 8, 9, 3, 11, 12, 13, 14, 15};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap12To5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int source = 12;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 13, 7, 8, 9, 10, 11, 12, 6, 14, 15};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapHelloToWorld() {
        String[] array = {"world", "hello"};
        int source = 1;
        int dest = 0;
        String[] result = SwitchArray.swapString(array, source, dest);
        String[] expected = {"hello", "world"};
        Assert.assertArrayEquals(expected, result);
    }
}
