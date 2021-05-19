package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        names[0] = "Ivan";
        names[1] = "Victoria";
        names[2] = "David";
        names[3] = "Matvey";

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива names равен: " + names.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
