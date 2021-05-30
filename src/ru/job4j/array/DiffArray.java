/*
* Разность множеств это операция, при которой
* в результирующее множество попадают элементы из первого множества,
* но только если их нет во втором множестве.
*/

package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;

        for (int l : left) {
            boolean flag = true;
            for (int r : right) {
                if (l == r) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = l;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
