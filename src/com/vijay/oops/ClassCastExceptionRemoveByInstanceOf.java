package com.vijay.oops;

class Animal {
	
}
class Dog extends Animal {
	
}
class Cat extends Animal {
	
}

public class ClassCastExceptionRemoveByInstanceOf {
	
	public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting (Dog -> Animal)
        
        // Checking if the object is an instance of Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // Downcasting (Animal -> Dog)
            System.out.println("This is a dog.");
        }
        
        //A ClassCastException occurs when an invalid downcast is attempted.
        
        // Checking if the object is an instance of Cat (gives class cast exception if not check)
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;  // Will not execute because 'animal' is a Dog
            System.out.println("This is a cat.");
        } else {
            System.out.println("This is not a cat.");
        }
    }
}

