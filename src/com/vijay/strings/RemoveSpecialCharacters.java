package com.vijay.strings;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s = "@Kvija00y$#!*k";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
	}
}
