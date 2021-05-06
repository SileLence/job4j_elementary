package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1632);
        int dollar = Converter.rubleToDollar(784);

        System.out.println("1632 rubles are " + euro + " euro.");
        System.out.println("784 rubles are " + dollar + " dollars.");
    }
}
