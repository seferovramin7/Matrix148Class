package org.matrix.Lesson_21;

public class LeetSolution {
    public static String restoreString(String s, int[] indices) {
        char[] shuffledArray = new char[indices.length];
        for(int i = 0; i < indices.length; i ++) {
            shuffledArray[indices[i]] = s.charAt(i);
        }
        return String.valueOf(shuffledArray);
    }

    public static void main(String[] args) {
        String codeleet = restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println(codeleet);
    }
}
