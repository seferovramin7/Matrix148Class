package org.matrix.Lesson_13;

public class Lesson13 {
    public static void main(String[] args) {
        int ans = 0, num = 0;
        // V
        // IV
        // CIV
        // XCIV
        // MXCIV
        // CMXCIV
        // MCMXCIV

        Object ob = new Lesson13();



        String s = "MCMXCIV";
        int ilkDeyer = s.length() - 1;

        for (int i = ilkDeyer; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    System.out.println("Hechbiri tapilmadi");
            }

            if (4 * num < ans) {
                ans = ans - num;
            } else {
                ans = ans + num;
            }
            System.out.println(ans);
        }
    }
}