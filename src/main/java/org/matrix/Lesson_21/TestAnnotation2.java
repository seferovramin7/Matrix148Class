package org.matrix.Lesson_21;

import java.util.ArrayList;

class TestAnnotation2 {
    @SuppressWarnings("unchecked")
    @Deprecated
    public static void main(String args[]) {
//        ArrayList list = new ArrayList<String>();
//        list.add("sonoo");
//        list.add("vimal");
//        list.add("ratan");

        ArrayList telebeSiyahisi = new ArrayList<>();
        Telebe arif = new Telebe();

        telebeSiyahisi.add(arif);
        telebeSiyahisi.add("Arif");

        for (Object obj : telebeSiyahisi)
            System.out.println(obj);
    }
}
