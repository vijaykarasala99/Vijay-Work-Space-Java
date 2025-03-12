package com.vijay;

public class FormalActual {
    public int add(int a, int b) {  // formal parameters or parameters
        return a + b;
    }
    
    public static void main(String[] args) {
        FormalActual f = new FormalActual();
        int result = f.add(10, 20); // actual arguments or arguments
        System.out.println("Sum: " + result);
    }
}