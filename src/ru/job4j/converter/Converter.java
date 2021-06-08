package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 1632;
        int expectedEuro = 23;
        int expectedDollars = 27;
        int outEuro = Converter.rubleToEuro(in);
        int outDollars = Converter.rubleToDollar(in);
        boolean passedEuroConversion = expectedEuro == outEuro;
        boolean passedDollarConversion = expectedDollars == outDollars;
        System.out.println(in + " rubles are " + outEuro + " euro. Test result: " + passedEuroConversion);
        System.out.println(in + " rubles are " + outDollars + " dollars. Test result: " + passedDollarConversion);
    }
}
