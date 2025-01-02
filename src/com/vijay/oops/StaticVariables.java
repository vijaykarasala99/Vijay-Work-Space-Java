package com.vijay.oops;

public class StaticVariables {
	// Instance methods can access both instance variables (because they are part of the object)
	// and static variables (because they belong to the class).
	// Static methods can only access static variables and other
	// static methods, as they do not have access to instance-specific data.

	       int a = 10;
	static int b = 20;

	static void add1() {
		StaticVariables s = new StaticVariables();
		System.out.println(s.a);
		System.out.println(StaticVariables.b);
	}

	void add2() {
		System.out.println(a);
		System.out.println(StaticVariables.b);
	}

	public static void main(String[] args) {
		b=30; //we can change static variables
		StaticVariables s = new StaticVariables();
		System.out.println("instance var:   " + s.a);
		System.out.println("static var:  " + b);
		s.add1();
		s.add2();
	}
}


