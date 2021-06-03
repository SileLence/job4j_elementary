/*
* Назовем аномалиями диапазоны индексов, на которых
* значения массива меньше или равно down или больше или равно up.
* Ваша задача найти все аномалии в массиве. Если в аномалии одно,
* число то нужно вернуть диапазон [i, i] - где i индекс числа выходящего за границы.
*/

package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int row = 0;
        int cell = 0;

        for (int i = 0; i < data.length; i++) {
            if (cell == 0 && (data[i] <= down || data[i] >= up)) {  // Проверяем условие и создаём массив ячеек
                result[row] = new int[data.length];
                result[row][cell] = i;
                cell++;
            } else if (cell != 0 && (data[i] <= down || data[i] >= up)) {  // Продолжаем заполнять массив ячеек
                result[row][cell] = i;
                cell++;
                if (i == data.length - 1) {  // Если это последний индекс в цикле, то обрезаем массив
                    result[row] = Arrays.copyOf(result[row], cell);
                    row++;
                    cell = 0;
                }
            } else if (cell != 0 && (data[i] > down || data[i] < up)) {  // Если элемент не соответствует, обрезаем массив
                if (cell == 1) {  // При этом, если заполнена лишь одна ячейка, то обрезаем до cell + 1
                    result[row][cell] = i - 1;
                    result[row] = Arrays.copyOf(result[row], cell + 1);
                    row++;
                    cell = 0;
                    continue;
                }
                result[row] = Arrays.copyOf(result[row], cell);  // Обрезка для массивов с cell > 1
                row++;
                cell = 0;
            }
        }
        System.out.println(Arrays.deepToString(Arrays.copyOf(result, row)));
        return Arrays.copyOf(result, row);
    }
}
