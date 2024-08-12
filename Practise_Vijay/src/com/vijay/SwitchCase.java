package com.vijay;

public class SwitchCase {

	public static void main(String[] args) {

		int value=1;
		
		switch (value) {
		case 5:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		default:
			System.out.println("default-day");
		}
	}
}



//   from here advanced switch case which is introduced from java12v
//	        String dayName = switch (day) {
//	            case 1 -> "Monday";
//	            case 2 -> "Tuesday";
//	            case 3 -> "Wednesday";
//	            case 4 -> "Thursday";
//	            case 5 -> "Friday";
//	            case 6 -> "Saturday";
//	            case 7 -> "Sunday";
//	            default -> "Invalid day";
//	        };
//
//	        System.out.println("Day of the week is: " + dayName);
//	    }




