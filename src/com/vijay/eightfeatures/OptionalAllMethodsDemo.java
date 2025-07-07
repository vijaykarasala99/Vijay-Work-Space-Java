package com.vijay.eightfeatures;
import java.util.Optional;

public class OptionalAllMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Vijay";
        String str2 = null;

        // 1. of() - Use when value is guaranteed non-null
        Optional<String> opt1 = Optional.of(str1);
        System.out.println("1. of(): " + opt1.get());

        // 2. ofNullable() - Safe wrapper for nullable values
        Optional<String> opt2 = Optional.ofNullable(str2);
        System.out.println("2. ofNullable(): " + opt2);

        // 3. isPresent() - Check if value exists
        System.out.println("3. isPresent(): " + opt1.isPresent());

        // 4. ifPresent() - Run lambda if value is present
        opt1.ifPresent(s -> System.out.println("4. ifPresent(): Hello, " + s));

        // 5. get() - Get value (use only when isPresent is true)
        if (opt1.isPresent()) {
            System.out.println("5. get(): " + opt1.get());
        }

        // 6. orElse() - Provide default value if null
        System.out.println("6. orElse(): " + opt2.orElse("Default Name"));

        // 7. orElseGet() - Provide default value using lambda
        System.out.println("7. orElseGet(): " + opt2.orElseGet(() -> "Generated Name"));

        // 8. orElseThrow() - Throw exception if no value
        try {
            System.out.println("8. orElseThrow(): " + opt2.orElseThrow(() -> new RuntimeException("Value is missing")));
        } catch (Exception e) {
            System.out.println("8. orElseThrow(): Exception -> " + e.getMessage());
        }

        // 9. map() - Transform the value if present
        Optional<Integer> nameLength = opt1.map(String::length);
        System.out.println("9. map(): Length of name = " + nameLength.get());

        // 10. filter() - Filter value based on condition
        Optional<String> filtered = opt1.filter(s -> s.startsWith("V"));
        System.out.println("10. filter(): " + filtered.orElse("No match"));
    }
}

