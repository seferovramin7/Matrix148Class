package org.matrix.Lesson_14;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int arrayinUzunlughu = strs.length;
        if (arrayinUzunlughu == 0) {
            return "boshdur";
        }
        String birinciSoz = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String cariSoz = strs[i];
            while (cariSoz.indexOf(birinciSoz) != 0) {
                birinciSoz = birinciSoz.substring(0, birinciSoz.length() - 1);
            }
        }
        return birinciSoz;
    }

    public static void main(String[] args) {
        String[] strs = {"traktor", "tramvay", "travma"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);

        String cardNumber = "4169334433221122";
        System.out.println(cardNumber.indexOf("4169"));
    }
}