package com.vijay.aarealtime;

public class BatteryChecker {
    public static void main(String[] args) {
        int battery = 80; // Assume battery starts at 80%

        while (battery < 100) {
            System.out.println("Charging... Battery at " + battery + "%");
            battery += 5; // Simulate charging
        }

        System.out.println("Battery fully charged!");
    }
}
