package com.vijay.memoryleaks;
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
	//Memory Leak in Static Variables or Singletons
	public static void main(String[] args) {
        // Adding data (memory leak without clearData)
        LeakyClass.addData("Hello");
        LeakyClass.addData("World"); 
        // Solution: clear data to prevent memory leak
        LeakyClass.clearData();
    }
}


class LeakyClass {
    
	private static List<String> data = new ArrayList<>(); // Static list holding data

    public static void addData(String value) {
        data.add(value); // Memory grows as items are added
    }

    public static void clearData() {
        data.clear(); // Solution: clears list to free up memory
    }
}

