package org.matrix.Lesson_4;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int a = 10;
        boolean pulumVarmi = true;
        while (pulumVarmi) {
            System.out.println("Miqdar " + a);
            a = a - 1;
            if (a == 0) {
                pulumVarmi = false;
            }
        }


    }
}
