package ru.job4j.array;

public class LengthArrayOfArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

        for (int row = 0; row < array.length; row++) {
            System.out.println(
                    "Размер вложенного массива равен: "
                            + array[row].length
            );
        }
    }
}
