package com.vijay.eightfeatures;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCountStreamAPI {
    public static void main(String[] args) {
        String s = "virtusa Consulting Private limited";

        Map<Character, Long> map = s.replaceAll(" ", "") // remove spaces
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}
