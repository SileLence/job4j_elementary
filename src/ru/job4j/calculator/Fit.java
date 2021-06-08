package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 180;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Ideal weight for man with height " + manHeight + " cm is " + man + " kg.");
        System.out.println("Ideal weight for woman with height " + womanHeight + " cm is " + woman + " kg.");
    }

}
