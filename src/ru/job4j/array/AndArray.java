package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;

        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    result[count] = i;
                    count++;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}
