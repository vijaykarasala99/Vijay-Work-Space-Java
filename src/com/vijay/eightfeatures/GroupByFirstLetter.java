package com.vijay.eightfeatures;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Avocado", "Banana", "Blueberry");

        // Group by first letter
        Map<String, List<String>> map = list.stream()
            .collect(Collectors.groupingBy(s -> s.substring(0, 1)));

        System.out.println(map);
        
    }
}
