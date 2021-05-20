package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];

        for (int i = 0; i < bound; i++) {
            result[i] = i * i;
        }
        return result;
    }
}
