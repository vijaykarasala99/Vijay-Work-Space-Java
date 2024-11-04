package com.vijay.strings;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s = "@Kvi ja00y$#!*k";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		System.out.println("==============");

		String s1 = "@Kvija00y$#!*k";
		s1 = s1.replaceAll("\\W", "");
		System.out.println(s1);
	}
}
