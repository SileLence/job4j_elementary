package ru.job4j.condition;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(exist(3, 4, 7));
    }

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ab + bc > ac) && (bc + ac > ab);
    }
}
