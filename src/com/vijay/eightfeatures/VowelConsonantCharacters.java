package com.vijay.eightfeatures;

public class VowelConsonantCharacters {
    public static void main(String[] args) {
        String input = "Java Stream API Example";

        System.out.print("Vowels: ");
        input.chars()
             .mapToObj(c -> (char) c)
             .filter(Character::isLetter)
             .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
             .forEach(c -> System.out.print(c + " "));

        System.out.println();

        System.out.print("Consonants: ");
        input.chars()
             .mapToObj(c -> (char) c)
             .filter(Character::isLetter)
             .filter(c -> "aeiouAEIOU".indexOf(c) == -1)
             .forEach(c -> System.out.print(c + " "));
    }
}
