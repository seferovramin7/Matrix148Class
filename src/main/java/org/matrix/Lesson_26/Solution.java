package org.matrix.Lesson_26;

class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = stones.charAt(i);
            int indexOf = jewels.indexOf(c);
            if (indexOf > -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = numJewelsInStones("aAsdsdsdsd", "abAAbbbb");
        System.out.println(i);
    }
}
