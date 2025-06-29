package com.vijay.java17;

public sealed class Vehicle permits Car, Bike {

    public void display() {
        // Default implementation (optional)
    }
}

final class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a Car.");
    }
}

final class Bike extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a Bike.");
    }
}

class TestSealed {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        
        vehicle1.display();  // Output: This is a Car.
        vehicle2.display();  // Output: This is a Bike.
    }
}
