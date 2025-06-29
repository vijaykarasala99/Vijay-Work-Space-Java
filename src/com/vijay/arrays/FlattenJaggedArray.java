package com.vijay.arrays;
import java.util.Arrays;

public class FlattenJaggedArray {
    public static void main(String[] args) {
        int[][] array = { { 1, 2 }, { 3, 4, 5 }, { 6 }, { 7, 8, 9, 10 } };
        
        //2D Array to 1D Array
        int[] oneDArray = Arrays.stream(array)
                                .flatMapToInt(Arrays::stream)
                                .toArray();

        System.out.println(Arrays.toString(oneDArray));
    }
}
