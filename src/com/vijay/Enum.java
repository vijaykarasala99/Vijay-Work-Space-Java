package com.vijay;

public class Enum {

//An enum (short for "enumeration") in Java is a special data type 
//used to define a collection of constants
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}
	public static void main(String[] args) {

		Day today = Day.THURSDAY;
		
		switch (today) {
		case SUNDAY:
			System.out.println("Relaxing Day");
			break;
		case MONDAY:
			System.out.println("Work Day");
			break;
		default:
			System.out.println("Default Day");
			break;
		}
	}
}

