package org.matrix.Lesson_17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A:");
        String bin1 = sc.nextLine();

        System.out.println("\nEnter B:");
        String bin2 = sc.nextLine();
        // following method is used to parse the binary number from the string.
        int A = Integer.parseInt(bin1, 2);
        int B = Integer.parseInt(bin2, 2);
        Long sum = (long) A + B;

        System.out.println(Long.toBinaryString(sum));
        sc.close();
    }
}
