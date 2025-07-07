package com.vijay.java11;

import java.util.stream.Stream;

public class Java11StringMethodsDemo {

	public static void main(String[] args) {
		String str1 = "   "; // Only spaces
		String str2 = " Hello\nWorld\nJava "; // Contains multiple lines
		String str3 = "\u2001 Java \u2001"; // Unicode whitespace
		String str4 = "Hi";

		// 1. isBlank()
		System.out.println("isBlank: " + str1.isBlank()); // true

		// 2. lines()
		Stream<String> lines = str2.lines();
		lines.forEach(System.out::println); // Hello, World, Java

		// 3. strip()
		System.out.println("Strip Ex:" + str3.strip()); // Java

		// 4. stripLeading()
		System.out.println("stripLeading: [" + str3.stripLeading() + "]");

		// 5. stripTrailing()
		System.out.println("stripTrailing: [" + str3.stripTrailing() + "]");

		// 6. repeat(int count)
		System.out.println("repeat: " + str4.repeat(03)); // HiHiHi

	}
}

