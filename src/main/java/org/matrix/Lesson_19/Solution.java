package org.matrix.Lesson_19;

public class Solution {

    static int mySqrt(int x) {
        if (x <= 1)
            return x;
        return (int) Math.floor(Math.sqrt(x));
    }

    public static void main(String args[]) {
        int x = 25;
        System.out.println(mySqrt(x));
    }
}
