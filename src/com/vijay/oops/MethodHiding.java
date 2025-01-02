package com.vijay.oops;

class Parent {
    // Static method in Parent
    public static void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    // Static method in Child (hiding the method in Parent)
    public static void display() {
        System.out.println("Child display");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        MethodHiding m = new MethodHiding();
        // Method hiding - resolved at compile-time based on the reference type
        obj1.display();  // Output: Parent display
        obj2.display();  // Output: Parent display (due to compile-time binding)
    }
}

