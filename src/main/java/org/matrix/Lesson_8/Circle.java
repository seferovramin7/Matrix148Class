package org.matrix.Lesson_8;

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
//    public Circle(String color, double radius) {
//        super(color);
//        this.radius = radius;
//    }

    @Override
    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Bu hendesi formanin rengi : " + super.color + " sahesi ise" + area();
    }

    //    @Override
//    double area() {
//        return Math.PI * Math.pow(radius, 2);
//    }
//
//    @Override
//    public String toString() {
//        return "Circle color is " + super.getColor() + "and area is : " + area();
//    }
}
