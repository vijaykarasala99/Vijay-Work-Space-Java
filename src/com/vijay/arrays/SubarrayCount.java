package com.vijay.arrays;
public class SubarrayCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
       
        int count = 0;
        
        int N=arr.length;
        System.out.println("The Total No Of Subarrays: " +(N*(N+1))/2 );
        
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                count++; 
            }
        }

        System.out.println("Total number of subarrays: " + count);
    }
}

