package ru.job4j.condition;

public class AlertDizByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-7);
    }

    public static void possibleDiv(int divider) {
        if (divider == 0) {
            System.out.println("Could not div by 0.");
        } else if (divider < 0) {
            System.out.println("This is negative numbers.");
        }
    }
}
