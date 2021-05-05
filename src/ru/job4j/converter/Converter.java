package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(275);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("275 rubles are " + dollar + " dollars.");
        System.out.println("1 euro are " + 70 / 60 + " dollars.");
        System.out.println("1 dollar are " + 60 / 70 + " euro.");
    }
}
