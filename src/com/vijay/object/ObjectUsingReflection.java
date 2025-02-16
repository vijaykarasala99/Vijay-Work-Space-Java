package com.vijay.object;

// Using Reflection (Class.forName()) we can create object
// Used for dynamic object creation.
class Example {
	void show() {
		System.out.println("Object created using Reflection!");
	}
}

public class ObjectUsingReflection {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.vijay.object.Example");
		Example exObj = (Example) cls.getDeclaredConstructor().newInstance();
		exObj.show();
	}
}
