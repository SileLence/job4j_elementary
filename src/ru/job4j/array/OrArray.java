/*
* Объединение множеств это такая операция,
* при которой в результирующее множество попадают элементы,
* которые есть хотя бы в одном множестве.
*/

package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;

        for (int l : left) {
            result[index] = l;
            index++;
        }
        for (int r : right) {
            boolean flag = true;
            for (int i : result) {
                if (r == i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[index] = r;
                index++;
            }
        }
        return Arrays.copyOf(result,index);
    }
}
