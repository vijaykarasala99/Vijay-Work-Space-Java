package com.vijay.strings;

public class StringTest {
	public static void main(String[] args) {
		
		String s = "abc";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		
		// Here toString() ensures you're comparing two String objects, not a StringBuilder and a String
		   System.out.println(s.equals(sb.toString()));
	
	}
}
