package com.vijay.wrapper;

class Parent {
	void show() {
		System.out.println("Parent show");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("Child show");
	}
}

public class TypeCasting {
	public static void main(String[] args) {
		Parent p = new Parent(); // Parent object
		p.show(); // Output: Parent show
		// Upcasting - Child object is assigned to a Parent reference
		p = new Child(); // This is upcasting (implicit, no need for (Parent) cast)
		p.show(); // Output: Child show (because of polymorphism)
		// Downcasting - Converting back to Child reference
		Child c = (Child) p; // Downcasting is required explicitly
		c.show(); // Output: Child show
	}
}
