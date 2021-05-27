package ru.job4j.array;

public class SwapColumns {
    public static void swap(int[][] data, int src, int dst) {
        int[][] temp = new int[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            temp[i][src] = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp[i][src];
        }
    }
}
