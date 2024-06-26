package com.vijay;

public class Swapping {
	public static void main(String[] args) {

//for numbers swapping  a=a+b; b=a-b; a=a-b;

		String s1 = "VIJAY";
		String s2 = "KARASALA";
		System.out.println("Strings Before Swapping: " + s1 + " , " + s2);

		s1 = s1.concat(s2);
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("Strings After Swapping: " + s1 + " , " + s2);

	}
}  