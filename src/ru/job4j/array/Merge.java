package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int indexOfLeft = 0;
        int indexOfRight = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexOfLeft < left.length && indexOfRight < right.length) {
                if (left[indexOfLeft] < right[indexOfRight]) {
                    result[i] = left[indexOfLeft];
                    indexOfLeft++;
                } else {
                    result[i] = right[indexOfRight];
                    indexOfRight++;
                }
            } else if (indexOfLeft < left.length) {
                result[i] = left[indexOfLeft];
                indexOfLeft++;
            } else if (indexOfRight < right.length) {
                result[i] = right[indexOfRight];
                indexOfRight++;
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
