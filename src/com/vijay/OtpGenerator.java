package com.vijay;

import java.security.SecureRandom;

public class OtpGenerator {
	
  public static void main(String[] args) {
		String otp = generateOtp();
		System.out.println("Generated OTP: " + otp);
	}

	public static String generateOtp() {
		SecureRandom random = new SecureRandom();
		int otp = 1000 + random.nextInt(9000);
		return String.valueOf(otp);

	}

}
