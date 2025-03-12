package com.vijay;
import java.util.Scanner;

public class SimpleLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentFloor = 0; // Lift starts at ground floor

        while (true) {
            System.out.print("Enter the floor number (-1 to exit): ");
            int requestedFloor = scanner.nextInt();

            if (requestedFloor == -1) {
                System.out.println("Exiting lift simulation.");
                break;
            }

            if (requestedFloor == currentFloor) {
                System.out.println("Lift is already at floor " + currentFloor);
            } else {
                System.out.println("Lift moving from floor " + currentFloor + " to floor " + requestedFloor);
                currentFloor = requestedFloor;
                System.out.println("Lift has reached floor " + currentFloor);
            }
        }
        scanner.close();
    }
}
