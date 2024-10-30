package com.vijay.strings;

import java.util.StringJoiner;

public class StringJoinerExample {
public static void main(String[] args) {
	// Specify the delimiter, prefix, and suffix in the constructor
    StringJoiner joiner = new StringJoiner(", ", "[", "]");
	joiner.add("apple");
	joiner.add("banana");
	joiner.add("grape");
	joiner.add("orange");

	String result= joiner.toString();
	System.out.println(result);
}
}
//Using this StringJoiner class we can join more than one strings with the specified delimiter, 
//we can also provide prefix and suffix to the final string while joining multiple strings. 