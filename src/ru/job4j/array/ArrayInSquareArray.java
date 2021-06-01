/*
* Метод принимает массив целочисленных значений. Необходимо реализовать метод,
* который превратит одномерный массив в квадратный двумерный.
*/

package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int side = (int) Math.ceil(Math.sqrt(array.length));
        int index = 0;
        int[][] square = new int[side][side];

        for (int row = 0; row < square.length; row++) {
            for (int cell = 0; cell < square[row].length; cell++) {
                if (index < array.length) {
                    square[row][cell] = array[index];
                    index++;
                }
            }
        }
        return square;
    }
}
