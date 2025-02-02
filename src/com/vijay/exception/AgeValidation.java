package com.vijay.exception;

public class AgeValidation {
	public static void main(String[] args) {
		try {
			int age = 16;
			if (age < 18) {
				throw new AgeNotValidException("Age must be 18 or above.");
			}
		} catch (AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}
}

class AgeNotValidException extends Exception {
	public AgeNotValidException(String message) {
		super(message);
	}
}