package com.vijay.garbagereflection;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Shallow Clone
    public Person clone() {
        return new Person(this.name);
    }
}

public class ShallowCloningExample {
    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = p1.clone();

        System.out.println("Original: " + p1.name);
        System.out.println("Cloned: " + p2.name);

        p2.name = "Mike";  // Modifying cloned object
        System.out.println("Modified Cloned: " + p2.name);
        System.out.println("Original after modification: " + p1.name);
    }
}

