/*
* Симметрическая разность - это такая операция,
* когда в результирующее множество попадают все элементы из обоих множеств,
* кроме тех, которые есть и в том и в другом множествах.
*/

package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;

        for (int l : left) {
            boolean flag = true;
            for (int r : right) {
                if (l == r) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[index] = l;
                index++;
            }
        }
        for (int r : right) {
            boolean flag = true;
            for (int l : left) {
                if (r == l) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[index] = r;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
