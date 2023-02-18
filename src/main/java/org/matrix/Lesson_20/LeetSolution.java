package org.matrix.Lesson_20;

public class LeetSolution {
    public static void main(String[] args) {
        int i = balancedStringSplit("RLRRLLRLRL");
        System.out.println(i);
    }

    public static int balancedStringSplit(String s) {
        int sum = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                sum++;
            } else {
                sum--;
            }
            if (sum == 0) {
                ans++;
            }
        }
        return ans;
    }
}
