package org.matrix.Lesson_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sol {
    public static List<Integer> findBiggestFamily(int N) {
        Map<String, List<Integer>> families = new HashMap<>();
        for (int i = 1; i < Math.pow(10, N); i++) {
            String digits = sortDigits(i);
            if (families.containsKey(digits)) {
                families.get(digits).add(i);
            } else {
                List<Integer> family = new ArrayList<>();
                family.add(i);
                families.put(digits, family);
            }
        }
        List<Integer> biggestFamily = Collections.emptyList();
        for (List<Integer> family : families.values()) {
            if (family.size() > biggestFamily.size()) {
                biggestFamily = family;
            }
        }
        return biggestFamily;
    }

    private static String sortDigits(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        List<Integer> biggestFamily = findBiggestFamily(3);
        System.out.println("Biggest family of 3-digit numbers: " + biggestFamily);
    }
}
