package com.vijay;

import java.security.SecureRandom;
// Cryptographically means using secure mathematical techniques, 
// like encryption and randomness, to protect data from attacks.
public class OtpGenerator {

  public static void main(String[] args) {
	//old approach with Math.random
	//int otp = (int)(Math.random() * 9000) + 1000;
	  
	  String otp = generateOtp();
	  System.out.println("Generated OTP: " + otp);
	}

	public static String generateOtp() {
		SecureRandom random = new SecureRandom();
		int otp = 1000 + random.nextInt(9000);
		return String.valueOf(otp);

	}
}
