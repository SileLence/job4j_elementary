package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double xResult = Math.pow((x2 - x1), 2);
        double yResult = Math.pow((y2 - y1), 2);

        return Math.sqrt(xResult + yResult);
    }

    public static void main(String[] args) {
        System.out.println("Distance between points (0, 0) and (2, 0) equals: " + Point.distance(0,0,2,0));
        System.out.println("Distance between points (4, -2) and (5, 7) equals: " + Point.distance(4,-2,5,7));
        System.out.println("Distance between points (0, 0) and (0, 0) equals: " + Point.distance(0,0,0,0));
        System.out.println("Distance between points (-14, -3) and (7, 35) equals: " + Point.distance(-14,-3,7,35));
        System.out.println("Distance between points (-1, -2) and (-5, -5) equals: " + Point.distance(-1,-2,-5,-5));
    }
}