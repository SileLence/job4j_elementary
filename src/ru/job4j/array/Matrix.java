package ru.job4j.array;

public class Matrix {
    public static int[][] multiply(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                multiplicationTable[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return multiplicationTable;
    }
}
