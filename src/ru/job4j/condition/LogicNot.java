package ru.job4j.condition;

public class LogicNot {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Число " + num + ":");
        System.out.println("Чётное? " + isEven(num));
        System.out.println("Положительное? " + isPositive(num));
        System.out.println("Нечётное? " + notEven(num));
        System.out.println("Отрицательное? " + notPositive(num));
        System.out.println("Нечётное и положительное? " + notEvenAndPositive(num));
        System.out.println("Чётное или отрицательное? " + evenOrNotPositive(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

}
