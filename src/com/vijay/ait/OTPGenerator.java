package com.vijay.ait;

import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // Generates a 6-digit OTP
        System.out.println("Generated OTP: " + otp);
    }
}