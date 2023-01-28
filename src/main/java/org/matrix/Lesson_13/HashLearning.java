package org.matrix.Lesson_13;

import java.util.GregorianCalendar;

public class HashLearning {
    public static void main(String[] args) throws InterruptedException {
        GregorianCalendar cal = new GregorianCalendar();
        // clone object cal into object y
        Thread.sleep(2000);
        GregorianCalendar y = (GregorianCalendar) cal.clone();
        GregorianCalendar calNew = new GregorianCalendar();

        // print both cal and y
        System.out.println("" + cal.getTime());
        System.out.println("" + y.getTime());
        System.out.println("" + calNew.getTime());


    }
}
