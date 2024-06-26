package com.vijay.arrays;

public class SecondMin {

	public static void main(String[] args) {
		 int arr[] = { 1, 2, 3, 4, 5 };
	        int firstMin =  Integer.MAX_VALUE;
	        int secondMin = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < firstMin) {
	                secondMin = firstMin;
	                firstMin = arr[i];
	            } else if (arr[i] < secondMin && arr[i] != firstMin) {
	                secondMin = arr[i];
	            }
	        }
	        if (secondMin == Integer.MAX_VALUE) {
	            System.out.println("There is no second minimum value.");
	        } else {
	            System.out.println("First Min: " + firstMin);
	            System.out.println("Second Min: " + secondMin);
}
}
}
