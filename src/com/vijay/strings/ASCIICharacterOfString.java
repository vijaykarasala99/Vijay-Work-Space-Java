package com.vijay.strings;

public class ASCIICharacterOfString {
	public static void main(String[] args) {
		String s = "VijayK";
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("ASCII Value Of: " + ch + "\t" + (int)ch);
        }
	}
}
