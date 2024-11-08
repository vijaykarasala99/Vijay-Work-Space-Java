package com.vijay.strings;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "hello jay";
		String[] arr = str.split(" ");
		//System.out.println(Arrays.toString(arr));
		String result = "";

		for (String word : arr) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev += word.charAt(i);
			}
			result = result + rev + " ";
		}
		// Remove the trailing space
		result = result.trim();
		System.out.println(result); 
	}
}

