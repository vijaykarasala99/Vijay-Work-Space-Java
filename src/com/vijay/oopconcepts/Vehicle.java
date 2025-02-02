package com.vijay.oopconcepts;
public class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car1();
        vehicle.move();
        
        vehicle = new Bike();
        vehicle.move();
    }
}

class Car1 extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is moving");
    }
}

