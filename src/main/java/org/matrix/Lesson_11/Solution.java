package org.matrix.Lesson_11;

import java.util.Arrays;

class Solution {
    public static int singleNumber(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        int i = 0;

        while (i < length - 2) {
            if (numbers[i] == numbers[i + 1]) {
                i = i + 2;
            } else {
                return numbers[i];
            }
        }
        return numbers[length - 1];
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,1,3,3,2,4,4,5};
        int i = singleNumber(numbers);
        System.out.println(i);

    }
}
