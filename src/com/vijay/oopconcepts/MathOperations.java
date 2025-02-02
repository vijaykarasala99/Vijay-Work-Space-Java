package com.vijay.oopconcepts;
public class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum (int): " + math.add(5, 3));
        System.out.println("Sum (double): " + math.add(5.5, 3.3));
    }
}
