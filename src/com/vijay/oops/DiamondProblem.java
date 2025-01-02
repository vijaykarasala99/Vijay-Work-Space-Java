package com.vijay.oops;

interface A {
	// Only constants (variables that are public, static, and final) can exist in interfaces
	// instance variables are not allowed in interfaces.
	public static final int a=100;

	default void show() {
		System.out.println("Interface A --> Show method...");
	}
}

interface B {
	default void show() {
		System.out.println("Interface B --> Show method...");
	}
}

public class DiamondProblem implements A, B {
	@Override
	public void show() {
		// Resolve the ambiguity by specifying which interface's method to call
		A.super.show(); // Calls the show method from Interface A

		// Alternatively, you can call B interface's show method:
		B.super.show();
		// Or provide a new implementation:
		System.out.println("DiamondProblem class's show method..." + A.a);
	}

	public static void main(String[] args) {
		DiamondProblem d = new DiamondProblem();
		d.show();
	}
}

