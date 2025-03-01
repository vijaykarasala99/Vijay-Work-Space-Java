package com.vijay.strings;

public class FirstNonRepeatUsinfFor {

	public static void main(String[] args) {

		String s = "ABAGADBAGS";

		for (int i = 0; i < s.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					unique = false;
					break;
				}

			}
			if (unique) {
				System.out.println(s.charAt(i));
				break;
			}
		}

	}
}