package com.vijay.oops;

class P {
    void display() {
        System.out.println("Parent display method...");
    }
}

class C extends P {
    void display() {
        System.out.println("Child display method...");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        P p1 = new P();
        p1.display();  // Calls P's display method

        P p2 = new C(); // Upcasting: A Child object is referred by a Parent reference
        p2.display();   // Calls C's overridden display method due to runtime polymorphism

        C c = (C) p2;   // Downcasting: Parent reference p2 is Converted to Child type
        c.display();    // Calls C's display method
    }
}
