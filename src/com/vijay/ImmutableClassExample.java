package com.vijay;

public final class ImmutableClassExample {

}






//Characteristics of an Immutable Class

//All fields are final: The fields of the class are declared as final so that their values cannot be changed once assigned.
//The class itself is final: The class is declared as final to prevent subclassing, which could alter its immutability.
//No setter methods: There are no methods provided to modify the fields.
//Fields are private: All fields are private to ensure they cannot be accessed directly.
//Constructor initialization: All fields are initialized via the constructor.
//Defensive copies: If the class has mutable object fields, defensive copies of these objects are used to ensure the immutability of the class.