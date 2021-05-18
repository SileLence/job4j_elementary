package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int result = 0;
        //int temp = length;
        while (length >= section) {
            length -= section;
            result++;
        }
        return result;
    }
}
