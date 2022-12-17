package org.matrix.Lesson_5;

public class Telebe {
    int rollNumber;
    String name;

    public Telebe(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return " Menim yeni telebem{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
