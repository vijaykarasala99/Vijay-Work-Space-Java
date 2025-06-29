package com.vijay.collections;

import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrayLists {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("a", "b", "c", "d");

        List<String> common = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        
        System.out.println("Common elements: " + common);
    }
}