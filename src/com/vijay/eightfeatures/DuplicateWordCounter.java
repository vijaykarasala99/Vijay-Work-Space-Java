package com.vijay.eightfeatures;
import java.util.*;
import java.util.stream.*;

public class DuplicateWordCounter {
    public static void main(String[] args) {
        Arrays.stream("I love India I love Java".split(" "))
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
            .forEach((k, v) -> {
                if (v > 1)
                    System.out.println(k + " → " + v);
            });
    }
}
