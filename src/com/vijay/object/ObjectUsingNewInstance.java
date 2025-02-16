package com.vijay.object;

import java.lang.reflect.Constructor;

// Using newInstance() of Constructor Class
// This method is part of Java Reflection API.
class A {
	void show() {
		System.out.println("A class's show method...");
	}
}

public class ObjectUsingNewInstance {
	public static void main(String[] args) throws Exception {
		Constructor<A> constructor = A.class.getDeclaredConstructor();
		A obj = constructor.newInstance();
		obj.show();
	}
}
