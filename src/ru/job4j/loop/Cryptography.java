package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {

        if (s.equals("")) {
            return "empty";
        } else if ((s.length() > 0) && (s.length() <= 4)) {
            return s;
        }

        StringBuilder cardNumber = new StringBuilder(s);
        for (int i = 0; i < cardNumber.length() - 4; i++) {
            cardNumber.setCharAt(i, '#');
        }
        return cardNumber.toString();
    }
}
