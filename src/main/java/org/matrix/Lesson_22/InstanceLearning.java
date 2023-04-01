package org.matrix.Lesson_22;

import java.util.ArrayList;
import java.util.List;

public class InstanceLearning {
    public static void main(String[] args) {
        Object o = new Integer(3);

        if (o instanceof Integer) {
            System.out.println("Integer");
        } else if (o instanceof String) {
            System.out.println("String");
        }

        List<String> list = new ArrayList();
        list.add("Tofiq");
    }
}
