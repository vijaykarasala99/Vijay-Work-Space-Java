package com.vijay.reflection;

class Employee {
	public void display() {
		System.out.println("Employee object created dynamically!");
	}
}

public class LoadingClassDynamically {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.vijay.reflection.Employee");
		Object empObj = clazz.getDeclaredConstructor().newInstance();
		clazz.getMethod("display").invoke(empObj);
		
	}
}
