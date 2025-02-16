package com.vijay.strings;

public class ProvingStringBufferBuilderThreadSafty {
	public static boolean hasSynchronizedMethods(Class<?> cls) {
		return cls.getDeclaredMethods()[0].toString().contains("synchronized");
	}

	public static void main(String[] args) {
		System.out.println(hasSynchronizedMethods(StringBuffer.class)); // true (Thread-safe)
		System.out.println(hasSynchronizedMethods(StringBuilder.class)); // false (Not thread-safe)

	}

}
