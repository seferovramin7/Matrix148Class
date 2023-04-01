package org.matrix.Lesson_21;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MenimAnnotasiyam {
    int deyer();
}

class Hello {
    @MenimAnnotasiyam(deyer = 90)
    public void sayHello() {
        System.out.println("hello annotation");
    }
}

//Accessing annotation
class TestCustomAnnotation1 {
    public static void main(String args[]) throws Exception {

        Hello h = new Hello();
        int reqem = h.getClass().getMethod("sayHello").getAnnotation(MenimAnnotasiyam.class).deyer();

        System.out.println("value is: " + reqem);
    }
}