package org.matrix.Lesson_22;

import java.util.ArrayList;

public class BoxMain {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        stringBox.add("Tural");
        integerBox.add(30);

        System.out.println(stringBox.get());
        System.out.println(integerBox.get());



    }
}
