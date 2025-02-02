package com.vijay.oopconcepts;
public class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        
        Shape circle = new Circle();
        circle.draw();
        
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
