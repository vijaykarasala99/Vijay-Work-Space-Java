package com.vijay.aarealtime;

public class EqualsMethodUseCase {
	  public static void main(String[] args) {
	        String usernameFromDB = "admin";
	        String passwordFromDB = "admin123";

	        String usernameEntered = new String("admin");
	        String passwordEntered = "admin123";

	        // ❌ Wrong way (reference check)
	        System.out.println(usernameFromDB == usernameEntered); // false

	        // ✅ Right way (content check)
	        if (usernameFromDB.equals(usernameEntered) && passwordFromDB.equals(passwordEntered)) {
	            System.out.println("✅ Login Success");
	        } else {
	            System.out.println("❌ Login Failed");
	        }
	    }
}
