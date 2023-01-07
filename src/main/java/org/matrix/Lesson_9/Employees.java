package org.matrix.Lesson_9;

public class Employees {
    int id;
    String name;
    int age;
    private static int nextId = 1;


    public Employees(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }

}
