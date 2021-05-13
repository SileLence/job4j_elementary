package ru.job4j.condition;

public class WeeklySalary {
    public static void main(String[] args) {
        int[] workingHours = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(calculate(workingHours));
    }

    public static int calculate(int[] hours) {
        int salary = 0;

        for (int i = 0; i < hours.length; i++) {
            if ((i < 5) && (hours[i] > 8)) {
                salary += 80 + ((hours[i] - 8) * 15);
            } else if ((i < 5) && (hours[i] <= 8) && (hours[i] > 0)) {
                salary += hours[i] * 10;
            } else if ((i >= 5) && (hours[i] > 8)) {
                salary += 160 + ((hours[i] - 8) * 30);
            } else if ((i >= 5) && (hours[i] <= 8) && (hours[i] > 0)) {
                salary += hours[i] * 20;
            }
        }
        return salary;
    }
}
