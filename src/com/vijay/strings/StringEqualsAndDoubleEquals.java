package com.vijay.strings;

public class StringEqualsAndDoubleEquals {

	public static void main(String[] args) {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2); // false, because they are different objects in memory
	
		System.out.println(str1.equals(str2));  //true, because .equals compares content
		
		//if two objects are equal based on .equals then hashcodes must be same
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		String str3 = str1;
		System.out.println(str1 == str3); // true, because they reference the same object

	
	}
}
