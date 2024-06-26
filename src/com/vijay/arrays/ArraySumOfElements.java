package com.vijay.arrays;

import java.util.Scanner;

public class ArraySumOfElements {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements: ");
	
	for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }
	int sum=0;
	for(int i=0;i<arr.length;i++) {
	sum+=arr[i];
}
    System.out.println("sum of array is: " +sum);
}
}
