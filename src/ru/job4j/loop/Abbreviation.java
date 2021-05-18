package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result.append(s.charAt(i + 1));
            }
        }
        return result.toString();
    }
}
