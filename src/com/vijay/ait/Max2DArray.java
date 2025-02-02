package com.vijay.ait;
public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 9, 6}, {7, 8, 5}};
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println("Maximum element in 2D array: " + max);
    }
}
