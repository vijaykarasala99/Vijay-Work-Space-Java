package com.vijay.eight;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = Arrays.stream(str1.split(""))
                                  .sorted()
                                  .collect(Collectors.joining())
                                  .equals(Arrays.stream(str2.split(""))
                                                .sorted()
                                                .collect(Collectors.joining()));
        System.out.println(isAnagram);
    }
}
