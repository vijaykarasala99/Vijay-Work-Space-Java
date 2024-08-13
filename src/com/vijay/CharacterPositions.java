package com.vijay;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterPositions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter the character to find: ");
        char charToFind = sc.next().charAt(0);
        // List to store the positions of the character
        List<Integer> positions = new ArrayList<>();
        // Iterate through the string to find all occurrences of the character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToFind) {
                positions.add(i);
            }
        }
        System.out.println("Character '" + charToFind + "' found at position: " + positions);
        sc.close();
    }
}
