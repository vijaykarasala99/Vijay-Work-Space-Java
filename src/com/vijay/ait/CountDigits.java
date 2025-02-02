package com.vijay.ait;

public class CountDigits {
	public static void main(String[] args) {
        int number = 1225;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}