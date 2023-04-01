package org.matrix.Lesson_25;

class SolutionMove {
    public static int[] moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - snowBallSize] = t;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = moveZeroes(new int[] {1, 2, 0, 3, 4, 5});
        for (int e : ints) {
            System.out.println(e);
        }
    }
}