package org.matrix.Lesson_9;

abstract class Sunstar {
    abstract void capEt();
    abstract void greeting();
    void hello() {
        System.out.println("I'm parent");
    }
}

class Employee extends Sunstar {
    @Override
    void capEt(){
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

    void greeting(){
        System.out.println("Hello World!");
    }

}

class Engineer extends Sunstar {
    @Override
    void capEt(){
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

    @Override
    void greeting() {

    }
}

class Base {
    public static void main(String args[]) {
        Sunstar s = new Employee();
        Sunstar n = null;
        Engineer s1 = new Engineer();

        s.capEt();
        s.greeting();
        s.hello();
        s1.hello();
     }
}
