package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        boolean divideBy3 = number % 3 == 0;
        boolean divideBy5 = number % 5 == 0;
        if (divideBy3 && divideBy5) {
            return "Hello, World!!!";
        } else if (divideBy3) {
            return  "Hello";
        } else if (divideBy5) {
            return "World";
        }
        return "Operation not support";
    }
}
