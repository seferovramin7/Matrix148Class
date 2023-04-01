package org.matrix.Lesson_22;

class LeetSolution {
    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = truncateSentence("Hello how are you Contestant ssdsd eee", 4);
        System.out.println(s);
    }
}
