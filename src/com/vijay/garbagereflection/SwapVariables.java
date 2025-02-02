package com.vijay.garbagereflection;
public class SwapVariables {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        swap(arr, 0, 2);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
