package com.vijay;

public class Enum {

// enum is a special datatype in java used to define a collection of constants
 enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

	public static void main(String[] args) {
		// Using enum constants
		Day today = Day.SATURDAY;
		switch (today) {
		case SATURDAY:
			System.out.println("Relaxing day!");
			break;
		case MONDAY:
			System.out.println("Start of the workweek.");
			break;
		case WEDNESDAY:
			System.out.println("Midweek");
			break;
		default:
			System.out.println("regular day.");
		}
	}
}