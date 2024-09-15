package com.vijay;

public final class ImmutableClassExample {
	//An immutable class in Java is designed to ensure that once an instance is created, its state cannot be changed
	
	// Step 1: Private final fields
    private final int myNumber;
    private final String myString;
    
    // Step 2: Constructor initialization
    public ImmutableClassExample(int number, String string) {
        this.myNumber = number;
        this.myString = string;
    }
    
    // Step 3: No setter methods
    // Step 4: Getters for fields (no setters)
    public int getMyNumber() {
        return myNumber;
    }
    public String getMyString() {
        return myString;
    }
}

//Characteristics of an Immutable Class:

//All fields are final: The fields of the class are declared as final so that their values cannot be changed once assigned.
//The class itself is final: The class is declared as final to prevent subclassing, which could alter its immutability.
//No setter methods: There are no methods provided to modify the fields.
//Fields are private: All fields are private to ensure they cannot be accessed directly.
//Constructor initialization: All fields are initialized via the constructor.
//Defensive copies:If the class has mutable object fields, defensive copies of these objects are used to ensure the immutability of the class.


