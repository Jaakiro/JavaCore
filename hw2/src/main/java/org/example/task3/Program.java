package org.example.task3;

public class Program {
    public static boolean hasTwoConsecutiveZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}

