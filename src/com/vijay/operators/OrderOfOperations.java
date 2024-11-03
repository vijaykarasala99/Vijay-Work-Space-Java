package com.vijay.operators;

public class OrderOfOperations {
    public static void main(String[] args) {
        /* 
        Order of Operations in Java:

        1. Parentheses ()
           Evaluate expressions within parentheses first.

        2. Unary Operators
           Process unary plus (+), minus (-), increment (++), and decrement (--).

        3. Multiplicative Operators
           Evaluate multiplication (*), division (/), and modulus (%).

        4. Additive Operators
           Process addition (+) and subtraction (-).

        5. Relational Operators
           Compare values with <, >, <=, >=, ==, and !=.

        6. Logical Operators
           Evaluate logical AND (&&) and OR (||).

        7. Assignment Operators
           Perform assignments (=, +=, -=) last, evaluating the right side first.
        */

        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        boolean result = ((a + 2 * b) - (c / 3) > d) && (a < 10) || (b == 10);

        System.out.println("The result of the expression is: " + result);
    }
}
