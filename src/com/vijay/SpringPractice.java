package com.vijay;

class A {
	void show() {
		System.out.println("A Class SHOW...");
	}
}

class B {
	void display() {
		System.out.println("B Class display...");
	}
}

class C {
	void bookTickets() {
		System.out.println("C Class Book Tickets Method...");
	}
}

public class SpringPractice extends A {

	public static void main(String[] args) {

		SpringPractice obj = new SpringPractice();
		obj.show();

		// Tight Coupling
		B b = new B();
		b.display();

	}
}
