package com.vijay.arrays;

public class UniqueElementsPrint {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 5, 4, 5 };
		System.out.print("Unique elements: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean isUnique = true;

			for(int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.print(arr[i] + " ");
			}
		}
}}


// =================  Second Approach =========================

//int[] arr = {1, 2, 2, 3, 4, 1, 5};
//
//for (int i = 0; i < arr.length; i++) {
//    int count = 0;
//    for (int j = 0; j < arr.length; j++) {
//        if (arr[i] == arr[j]) {
//            count++;
//        }
//    }
//    if (count == 1) {
//        System.out.print(arr[i] + " ");
//    }
//}





