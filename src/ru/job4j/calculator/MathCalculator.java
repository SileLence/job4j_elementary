package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(10, 5));
        System.out.println(sumSubtractionAndDivision(10, 5));
        System.out.println(sumAllCalculations(10, 5));
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumSubtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumAllCalculations(double first, double second) {
        return sum(first, second)
                + subtraction(first, second)
                + multiply(first, second)
                + division(first, second);
    }
}
