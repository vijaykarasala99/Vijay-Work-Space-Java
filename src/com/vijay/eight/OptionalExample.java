package com.vijay.eight;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String value = null;
        Optional<String> optional = Optional.ofNullable(value);
        System.out.println(optional.orElse("Default value"));
    }
}
