package com.vijay.oopconcepts;
public class Car {
    String brand;
    String color;

    void start() {
        System.out.println("Car is starting.");
    }

    void stop() {
        System.out.println("Car has stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.color = "Red";
        car.start();
        car.stop();
    }
}
