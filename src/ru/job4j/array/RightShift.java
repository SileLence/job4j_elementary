
/*
* Ваша задача выполнить циклический сдвиг вправо с шагом count
*/

package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int lastElement = nums[nums.length - 1];
        int temp1 = nums[0];
        int temp2 = nums[1];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = temp1;
            temp1 = temp2;
            if (i + 1 != nums.length) {
                temp2 = nums[i + 1];
            }
        }
        nums[0] = lastElement;
    }
}
