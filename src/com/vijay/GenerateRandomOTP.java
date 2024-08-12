package com.vijay;

import java.security.SecureRandom;

public class GenerateRandomOTP {
    // Java's SecureRandom class, which provides a cryptographically strong random number generator.
    
	private static final SecureRandom secureRandom = new SecureRandom(); //thread-safe
    private static final String DIGITS = "0123456789";

    public static String generateOTP(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("OTP length must be greater than 0");
        }

        StringBuilder otp = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            otp.append(DIGITS.charAt(secureRandom.nextInt(DIGITS.length())));
        }
        return otp.toString();
    }

    public static void main(String[] args) {
        int length = 4; // specify the length of OTP
        String otp = generateOTP(length);
        System.out.println("Generated OTP: " + otp);
    }
}
