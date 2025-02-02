package com.vijay.ait;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        int number = 16;
        double sqrt = Math.sqrt(number);
        if (sqrt == (int) sqrt) {
            System.out.println(number + " is a perfect square");
        } else {
            System.out.println(number + " is not a perfect square");
        }
    }
}
