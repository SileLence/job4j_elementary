package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (rsl == left + right) return "added";
        if (rsl == left - right) return "subtracted";
        if (rsl == left * right) return "multiplied";
        if (rsl == left / right) return "divided";
        return "none";
    }
}