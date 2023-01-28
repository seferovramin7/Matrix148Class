package org.matrix.Lesson_15;

public class Circle implements Drawable {
    int radius;
    @Override
    public void draw() {
        System.out.println("drawing circle for : " + this.radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
