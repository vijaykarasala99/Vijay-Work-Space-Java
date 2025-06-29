package com.vijay.strings;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {

		String str = "aabbccdbabc";

		StringBuffer sb = new StringBuffer();
		 
		sb.append(str.charAt(0));
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i -1)) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
