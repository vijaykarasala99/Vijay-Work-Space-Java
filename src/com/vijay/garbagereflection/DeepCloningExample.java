package com.vijay.garbagereflection;
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person1 {
    String name;
    Address address;

    Person1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep Clone
    public Person1 clone() {
        Address newAddress = new Address(this.address.city); // Cloning address
        return new Person1(this.name, newAddress);
    }
}

public class DeepCloningExample {
    public static void main(String[] args) {
        Address address1 = new Address("New York");
        Person1 p1 = new Person1("John", address1);
        Person1 p2 = p1.clone();

        System.out.println("Original: " + p1.name + " " + p1.address.city);
        System.out.println("Cloned: " + p2.name + " " + p2.address.city);

        p2.address.city = "Los Angeles"; // Modify address of cloned object
        System.out.println("Modified Cloned: " + p2.name + " " + p2.address.city);
        System.out.println("Original after modification: " + p1.name + " " + p1.address.city);
    }
}
