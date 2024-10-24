package com.vijay.strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "h e l l  o";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s2);
		
        System.out.print("using replace all: ");
		s=s.replaceAll("\\s", "");
        System.out.println(s);
	}
}
