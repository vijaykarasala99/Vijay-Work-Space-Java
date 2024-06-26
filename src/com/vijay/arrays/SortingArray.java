package com.vijay.arrays;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int a[]= {4,5,1,2,3,1};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
		}
		}
		System.out.println(Arrays.toString(a));
	}
}
