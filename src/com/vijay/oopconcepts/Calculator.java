package com.vijay.oopconcepts;
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 3));
        System.out.println("Difference: " + calc.subtract(5, 3));
        System.out.println("Product: " + calc.multiply(5, 3));
        System.out.println("Quotient: " + calc.divide(5, 3));
    }
}
