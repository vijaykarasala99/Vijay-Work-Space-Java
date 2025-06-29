package com.vijay.wrapper;

public class MyClassLoaderCheck {
	public static void main(String[] args) {
		System.out.println("ClassLoader of this class: " + MyClassLoaderCheck.class.getClassLoader());

		System.out.println("ClassLoader of String class: " + String.class.getClassLoader());
		
		System.out.println(String.class.getClassLoader());              // null → Bootstrap
		System.out.println(java.sql.Driver.class.getClassLoader());     // Platform
		System.out.println(MyClassLoaderCheck.class.getClassLoader());  // AppClassLoader

	}
}


