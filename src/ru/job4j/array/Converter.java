/*
* Метод принимает двумерный массив у которого число рядов и число элементов в ряду не совпадают,
* также количество элементов в каждом ряду может быть абсолютно произвольным.
* Необходимо реализовать метод так, чтобы на выходе получился двумерный квадратный массив.
* При этом размерность выходного массива должна рассчитываться.
* Если для полного заполнения выходного массива в исходном массиве не хватает элементов,
* то необходимо дополнить массив 0.
*/

package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int side = (int) Math.ceil(Math.sqrt(countArrayLength(array)));
        int[][] square = new int[side][side];
        int row = 0;
        int cell = 0;

        for (int[] arrayRow : array) {
            for (int arrayCell : arrayRow) {
                if (row < side) {
                    if (cell >= side) {
                        row++;
                        cell = 0;
                    }
                    square[row][cell] = arrayCell;
                    cell++;
                }
            }
        }
        return square;
    }

    private static int countArrayLength(int[][] array) {
        int length = 0;

        for (int[] row : array) {
            for (int cell = 0; cell < row.length; cell++) {
                length++;
            }
        }
        return length;
    }
}
