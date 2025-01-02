package com.vijay.oops;

public class StaticBinding {

    // Static method - resolved at compile time
    static void display() {
        System.out.println("Static method");
    }

    // Final method - cannot be overridden, resolved at compile time
    final void show() {
        System.out.println("Final method");
    }

    // Private method - not accessible outside the class, resolved at compile time
    private void greet() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        StaticBinding obj = new StaticBinding();

        // Static binding examples
//Since these methods are not subject to runtime polymorphism, the binding happens at compile time.
        obj.display(); // Calls the static method
        obj.show();    // Calls the final method
        obj.greet();   // Calls the private method
    }
}


