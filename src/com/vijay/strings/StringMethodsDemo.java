package com.vijay.strings;

public class StringMethodsDemo {

    public static void main(String[] args) {
        //Creating Strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";
        String str4 = "hello";
        
        // 1. length() - Returns the length of the string
        System.out.println("Length of str1: " + str1.length());
        
        // 2. charAt() - Returns the character at a specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        
        // 3. substring() - Returns a part of the string
        System.out.println("Substring of str1 (index 1 to 4): " + str1.substring(1, 4));
        
        // 4. contains() - Checks if a string contains a particular sequence of characters
        System.out.println("Does str1 contain 'ell'? " + str1.contains("ell"));
        
        // 5. equals() - Compares two strings (case-sensitive)
        System.out.println("Is str1 equal to str4? " + str1.equals(str4));
        
        // 6. equalsIgnoreCase() - Compares two strings, ignoring case
        System.out.println("Is str1 equal to str4 (ignore case)? " + str1.equalsIgnoreCase(str4));
        
        // 7. concat() - Concatenates two strings
        String concatResult = str1.concat(" ").concat(str2);
        System.out.println("Concatenation of str1 and str2: " + concatResult);
        
        // 8. replace() - Replaces characters or substrings
        String replacedStr = str1.replace('l', 'p');
        System.out.println("Replacing 'l' with 'p' in str1: " + replacedStr);
        
        // 9. toUpperCase() - Converts the string to uppercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        
        // 10. toLowerCase() - Converts the string to lowercase
        System.out.println("str2 in lowercase: " + str2.toLowerCase());
        
        // 11. trim() - Removes leading and trailing spaces
        System.out.println("str3 after trimming: '" + str3.trim() + "'");
        
        // 12. startsWith() - Checks if the string starts with a specified prefix
        System.out.println("Does str1 start with 'He'? " + str1.startsWith("He"));
        
        // 13. endsWith() - Checks if the string ends with a specified suffix
        System.out.println("Does str2 end with 'ld'? " + str2.endsWith("ld"));
        
        // 14. indexOf() - Returns the index of the first occurrence of a character or substring
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        
        // 15. lastIndexOf() - Returns the index of the last occurrence of a character or substring
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));
        
        // 16. isEmpty() - Checks if the string is empty
        System.out.println("Is str1 empty? " + str1.isEmpty());
        
        // 17. split() - Splits the string based on a regular expression and returns an array
        String[] words = concatResult.split(" ");
        System.out.println("Words in the concatenated string:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // 18. valueOf() - Converts different data types to a string
        int number = 100;
        String strNumber = String.valueOf(number);
        System.out.println("String value of the integer 100: " + strNumber);
        
        // 19. compareTo() - Compares two strings lexicographically
        System.out.println("Comparing str1 with str2: " + str1.compareTo(str2));
        
        // 20. format() - Returns a formatted string
        String formattedString = String.format("Hello %s, welcome to %s!", "Vijay", "Java");
        System.out.println("Formatted string: " + formattedString);
    }
}



