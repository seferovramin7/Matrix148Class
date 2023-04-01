package org.matrix.Lesson_21;

public class LeetSolution {
    public static String restoreString(String s, int[] indices) {
        char[] shuffledArray = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            shuffledArray[indices[i]] = s.charAt(i);
        }
        return String.valueOf(shuffledArray);
    }

    public static void main(String[] args) {
//        String codeleet = restoreString("lsaam", new int[]{2,0,1,3,4});
//        System.out.println(codeleet);

        boolean isNight = false;
        Boolean checkNight = isNight;
        boolean checkIsNight = checkNight;
        System.out.println(checkIsNight);
    }
}
