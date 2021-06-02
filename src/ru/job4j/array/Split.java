/*
* В классе String есть метод split(), этот метод делит строки на части по разделителю.
* Ваша задача написать его аналог.
*/

package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];  // Создаём массив с количеством строк
        int length = 0;  // Длина будущей строки
        int row = 0;  // Индексы строк и количество строк (строка 27)
        int cell = 0;  // Индексы ячеек
        result[row] = new char[str.length]; // Создаём массив ячеек (символов)

        for (char value : str) {
            if (value == c) {  // При достижении разделителя...
                result[row] = Arrays.copyOf(result[row], length);  // ...укорачиваем массив ячеек до актуальной длины
                row++; // Переходим на новую строку
                cell = 0; // Сбрасываем отсчёт ячеек и длины
                length = 0;
                result[row] = new char[str.length];  // Создаём следующий массив ячеек
            } else {
                result[row][cell] = value;
                cell++;
                length++;
            }
        }
        result[row] = Arrays.copyOf(result[row], length);  // Укорачиваем последний массив ячеек до актуальной длины
        result = Arrays.copyOf(result, row + 1);  // Укорачиваем массив строк. row + 1, т.к. переменная содержит индексы, а не с количество элементов

        return result;
    }
}
