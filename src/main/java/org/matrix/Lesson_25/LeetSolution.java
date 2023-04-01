package org.matrix.Lesson_25;

public class LeetSolution {
    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
        return nums;
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int i = maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }
}
