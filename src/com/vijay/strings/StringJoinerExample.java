package com.vijay.strings;

import java.util.StringJoiner;

public class StringJoinerExample {
public static void main(String[] args) {
	StringJoiner joiner = new StringJoiner(",");
	joiner.add("apple");
	joiner.add("banana");
	joiner.add("grape");
	joiner.add("mango");

	String result= joiner.toString();
	System.out.println(result);
}
}
