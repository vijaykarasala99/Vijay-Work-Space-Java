package com.vijay.cloning;
class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    int id;
    Address address;

    Person(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Shallow clone (only copies references)
    Person shallowClone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    // Deep clone (clones mutable objects inside)
    Person deepClone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone();  // Clone mutable field separately
        return cloned;
    }
}

public class TestClone {
    public static void main(String[] args) throws Exception {
        Address addr = new Address("Mumbai");
        Person p1 = new Person(1, addr);

        Person p2 = p1.shallowClone();
        Person p3 = p1.deepClone();

        p1.address.city = "Delhi"; // Change original city

        System.out.println(p1.address.city); // Delhi
        System.out.println(p2.address.city); // Delhi (shallow affected)
        System.out.println(p3.address.city); // Mumbai (deep safe)
    }
}
