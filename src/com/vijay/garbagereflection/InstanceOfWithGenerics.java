package com.vijay.garbagereflection;
class Animal {}
class Dog extends Animal {}

public class InstanceOfWithGenerics {
    public static <T> void checkType(T obj) {
        if (obj instanceof Dog) {
            System.out.println("This is a Dog.");
        } else {
            System.out.println("This is not a Dog.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        
        checkType(dog);   // This is a Dog.
        checkType(animal); // This is not a Dog.
    }
}
