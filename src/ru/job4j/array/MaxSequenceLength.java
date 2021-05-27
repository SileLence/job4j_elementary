package ru.job4j.array;

public class MaxSequenceLength {
    public static int find(int[] array) {
        int count = 0;
        int maxLength = 0;
        int prev = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                prev = array[i];
                count += 1;
                maxLength = Math.max(maxLength, count);
            } else if (prev <= array[i]) {
                count += 1;
                maxLength = Math.max(maxLength, count);
                prev = array[i];
            } else {
                count = 1;
                prev = array[i];
            }
        }
        return maxLength;
    }
}
