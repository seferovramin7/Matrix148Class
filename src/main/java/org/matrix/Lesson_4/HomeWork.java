package org.matrix.Lesson_4;

public class HomeWork {
    public static void main(String[] args) {

        // 1 2 3 4 5
        int toplama = 0;
        for (int i = 1; i <= 5; i += 1) {
//           System.out.print(i + " ");
//           toplama += i;
        }
//        System.out.println("Cem : " + toplama);


        // 5
        // 1 * 2 * 3 * 4 * 5
        int faktorialNetice = 1;
        for (int a = 1; a <= 5; a++) {
            // 120
            faktorialNetice *= a;
        }
        System.out.println(faktorialNetice);


    }
}
