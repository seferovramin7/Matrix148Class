package org.matrix.Lesson_16;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temporary = nums[i];  // 0
                nums[i] = nums[j];   // 1
                nums[j] = temporary; // 0     // 0, 1, 2, 2, 3, 0, 4, 2
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int i = removeElement(new int[]{1, 1, 2, 1, 3, 0, 4, 1}, 1);
        System.out.println(i);
    }

}
