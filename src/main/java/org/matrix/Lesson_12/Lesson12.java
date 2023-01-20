package org.matrix.Lesson_12;

public class Lesson12 {
    public static void main(String[] args) {
        String romanNumber = "XVIII";
        int length = romanNumber.length();
        for (int i = 0; i < length; i++) {
            char c = romanNumber.charAt(i);
            System.out.println(c);
        }
    }
}
