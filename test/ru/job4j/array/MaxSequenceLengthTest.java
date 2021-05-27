package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSequenceLengthTest {

    @Test
    public void test() {
        assertEquals(1, MaxSequenceLength.find(new int[] {1}));
        assertEquals(1, MaxSequenceLength.find(new int[] {2, 1}));
        assertEquals(2, MaxSequenceLength.find(new int[] {1, 2}));
        assertEquals(4, MaxSequenceLength.find(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxSequenceLength.find(new int[] {1, 2, 1, 1, 2, 3}));
        assertEquals(1, MaxSequenceLength.find(new int[] {3, 2, 1}));
        assertEquals(5, MaxSequenceLength.find(new int[] {3, 2, 1, 1, 2, 1, 3, 4, 5, 5, 4, -2, 1, 0, 1}));
    }
}
