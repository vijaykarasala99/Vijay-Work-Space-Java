package com.vijay.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("====== For Each Loop =======");
		for (int values : arr) {
			System.out.println(values);
		}
		System.out.println("====== Reverse Array =======");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
	  }
		
	}
}
