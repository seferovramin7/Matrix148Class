package org.matrix.Lesson_23;

public class LeetSolution {

    public static void main(String[] args) {
//        int i = countDigits(7777);
//        System.out.println(i);

//        int num = 1011;
//        System.out.println(countDigit(num));

        System.out.println(1011/10);
    }

    public static int countDigit(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            int d = temp % 10;
            temp /= 10;
            if (d > 0 && num % d == 0)
                count++;
        }
        return count;
    }

//    public static int countDigits(int num) {
//        int count = 0;
//        String temp = Integer.toString(num);
//        int[] numbers = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++) {
//            numbers[i] = Character.getNumericValue(temp.charAt(i));
//            if (num % numbers[i] == 0) {
//                count++;
//            }
//        }
//
//        return count;
//    }



}
