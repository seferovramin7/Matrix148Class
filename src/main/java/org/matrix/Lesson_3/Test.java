package org.matrix.Lesson_3;

import java.util.GregorianCalendar;

class Test {
}


class Test2 implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class mainTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        // create a gregorian calendar, which is an object
        GregorianCalendar cal = new GregorianCalendar();

        // clone object cal into object y
        GregorianCalendar y = (GregorianCalendar) cal.clone();

        // print both cal and y
        System.out.println("" + cal.getTime());
        System.out.println("" + y.getTime());

        System.out.println(cal.hashCode());
        System.out.println(y.hashCode());



    }
}

