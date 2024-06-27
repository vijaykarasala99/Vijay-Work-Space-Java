package com.vijay.math;

public class MathMethodsExample {
    public static void main(String[] args) {
        // Minimum and Maximum
        int min = Math.min(10, 20);
        int max = Math.max(10, 20);
        System.out.println("Math.min(10, 20): " + min); // Output: 10
        System.out.println("Math.max(10, 20): " + max); // Output: 20
        
        // Square root and Power
        double sqrt = Math.sqrt(16);
        double pow = Math.pow(2, 3);
        System.out.println("Math.sqrt(16): " + sqrt); // Output: 4.0
        System.out.println("Math.pow(2, 3): " + pow); // Output: 8.0
        
        // Rounding, Ceiling, and Floor
        double round = Math.round(5.5); //if 5.5 or greater it prints 6.0
        double ceil = Math.ceil(5.3);   // if 5.1 or greater it prints 6.0
        double floor = Math.floor(5.7);  //it does not consider decimals prints 5.0
        System.out.println("Math.round(5.5): " + round); // Output: 6.0
        System.out.println("Math.ceil(5.3): " + ceil); // Output: 6.0
        System.out.println("Math.floor(5.7): " + floor); // Output: 5.0
        
        // Random number
        double random = Math.random();
        System.out.println("Math.random(): " + random); // Output: A random double between 0.0 and 1.0
        
        // Logarithms and Exponentiation
        double log = Math.log(10); // Natural logarithm (base e)
        double log10 = Math.log10(10); // Logarithm base 10
        double exp = Math.exp(2); // e raised to the power of 2
        System.out.println("Math.log(10): " + log); // Output: ~2.302585
        System.out.println("Math.log10(10): " + log10); // Output: 1.0
        System.out.println("Math.exp(2): " + exp); // Output: ~7.389056
        
        // Absolute value
        int absInt = Math.abs(-5);
        double absDouble = Math.abs(-5.5);
        System.out.println("Math.abs(-5): " + absInt); // Output: 5
        System.out.println("Math.abs(-5.5): " + absDouble); // Output: 5.5
        
        // Exact arithmetic methods
        try {
            int addExact = Math.addExact(1000000000, 1000000000);
            System.out.println("Math.addExact(1000000000, 1000000000): " + addExact); // Output: 2000000000
        } catch (ArithmeticException e) {
            System.out.println("Math.addExact overflow");
        }

        try {
            int subtractExact = Math.subtractExact(1000000000, 500000000);
            System.out.println("Math.subtractExact(1000000000, 500000000): " + subtractExact); // Output: 500000000
        } catch (ArithmeticException e) {
            System.out.println("Math.subtractExact overflow");
        }

        try {
            int multiplyExact = Math.multiplyExact(100000, 10000);
            System.out.println("Math.multiplyExact(100000, 10000): " + multiplyExact); // Output: 1000000000
        } catch (ArithmeticException e) {
            System.out.println("Math.multiplyExact overflow");
        }

        try {
            int incrementExact = Math.incrementExact(1000000000);
            System.out.println("Math.incrementExact(1000000000): " + incrementExact); // Output: 1000000001
        } catch (ArithmeticException e) {
            System.out.println("Math.incrementExact overflow");
        }

        try {
            int decrementExact = Math.decrementExact(-1000000000);
            System.out.println("Math.decrementExact(-1000000000): " + decrementExact); // Output: -1000000001
        } catch (ArithmeticException e) {
            System.out.println("Math.decrementExact overflow");
        }

        try {
            int negateExact = Math.negateExact(-1000000000);
            System.out.println("Math.negateExact(-1000000000): " + negateExact); // Output: 1000000000
        } catch (ArithmeticException e) {
            System.out.println("Math.negateExact overflow");
        }
}
}