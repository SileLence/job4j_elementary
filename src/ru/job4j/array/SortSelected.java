package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int indexOfMin = FindLoop.indexOf(data, min, i, data.length);

            int temp = data[i];
            data[i] = data[indexOfMin];
            data[indexOfMin] = temp;
        }
        return data;
    }
}
