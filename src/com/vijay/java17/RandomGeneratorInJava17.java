package com.vijay.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorInJava17 {
//Java 17 – Secure 4-Digit OTP using RandomGenerator (with L64X128MixRandom)

	public static void main(String[] args) {
		
		RandomGenerator rng = RandomGeneratorFactory.of("L64X128MixRandom").create();

		// Generate a 4-digit OTP (1000 to 9999)
		int otp = rng.nextInt(1000, 10000);
		System.out.println("Generated OTP: " + otp);

	}

}
