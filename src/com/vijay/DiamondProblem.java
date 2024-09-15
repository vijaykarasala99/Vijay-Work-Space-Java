package com.vijay;

interface A {
    default void show() {
        System.out.println("Interface A --> Show method...");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B --> Show method...");
    }
}

public class DiamondProblem implements A, B {
    @Override
    public void show() {
        // Resolve the ambiguity by specifying which interface's method to call
        A.super.show(); // Calls the show method from Interface A
        
        // Alternatively, you can call B interface's show method:
        // B.super.show();
        // Or provide a new implementation:
        // System.out.println("DiamondProblem's show method...");
    }

    public static void main(String[] args) {
        new DiamondProblem().show(); // Output: Interface A --> Show method...
    }
}

