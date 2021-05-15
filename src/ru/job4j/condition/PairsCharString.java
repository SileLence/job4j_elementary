package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.equals("") && r.equals("")) {
            return true;
        } else if ((l.charAt(0) == r.charAt(r.length() - 1))
                && (l.charAt(l.length() - 1) == r.charAt(0))) {
            return true;
        }
        return false;
    }
}
