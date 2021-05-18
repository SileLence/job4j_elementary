package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean result = true;
        String number = i + "";

        for (int index = 0; index < number.length() / 2; index++) {
            if (number.charAt(index) != number.charAt(number.length() - 1 - index)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
