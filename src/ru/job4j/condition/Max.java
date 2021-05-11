package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(Max.max(4, 4));
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
