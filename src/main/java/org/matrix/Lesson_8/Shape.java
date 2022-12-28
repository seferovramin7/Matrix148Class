package org.matrix.Lesson_8;

abstract class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
      abstract double area();

    public abstract String toString();

    // this is a concrete method
    public String getColor() {
        return color;
    }
}



