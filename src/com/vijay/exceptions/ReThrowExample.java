package com.vijay.exceptions;

public class ReThrowExample {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Caught in main: " + e.getMessage());
		}
	}

	static void method1() throws Exception {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Caught in method1, rethrowing...");
			throw e; // Re-throwing the same exception
		}
	}

	static void method2() throws Exception {
		throw new Exception("Error in method2");
	}
}
