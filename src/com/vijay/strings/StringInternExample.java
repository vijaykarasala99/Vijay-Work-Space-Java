package com.vijay.strings;

public class StringInternExample {
	public static void main(String[] args) {
		// Creating two Strings with the same content but different memory locations
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		// Checking if they refer to the same object
		System.out.println("Before intern():");
		System.out.println("str1 == str2 : " + (str1 == str2)); // false, different objects
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true, same content

		// Interning str1
		str1 = str1.intern();

		// Interning str2
		str2 = str2.intern();

		// Checking if they refer to the same object after interning
		System.out.println("After intern():");
		System.out.println("str1 == str2 : " + (str1 == str2)); // true, same reference from String Pool
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true, same content

		// intern() optimizes memory by avoiding duplicate String objects in memory
		// when the same String literal is used multiple times.
	}
}
