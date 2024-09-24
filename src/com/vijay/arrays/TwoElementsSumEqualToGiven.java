package com.vijay.arrays;

import java.util.Scanner;

public class TwoElementsSumEqualToGiven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
        int n=sc.nextInt();
          int arr[]= {1,2,3,4,2};
          for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==n) {
				System.out.println(arr[i] +" and "+ arr[j] +" sum is equal to: " +n);
				}
			}
		}
	}
}
