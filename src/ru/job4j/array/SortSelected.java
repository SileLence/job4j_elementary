package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexOfMin = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, indexOfMin);
        }

        return data;
    }
}
