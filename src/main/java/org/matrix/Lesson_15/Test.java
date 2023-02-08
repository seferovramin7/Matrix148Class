package org.matrix.Lesson_15;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static String addBinary(String a, String b) {
        return new BigInteger(a,2).add(new BigInteger(b,2)).toString(2);
    }

    public static void main(String[] args) {
        String s = addBinary("1010", "1011");
        System.out.println(s);

    }
}
