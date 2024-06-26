package com.vijay.collections;

import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "vijay");
		ht.put(2, "vijay");
		ht.put(3, "jay");
		
		// Trying to add a duplicate key (overwrites existing value)
        ht.put(1, "kvs");

        // Trying to add a null key or value (will throw NullPointerException)
        // hashtable.put(null, "Null"); // this line will cause an exception
        // hashtable.put(4, null);      // this line will cause an exception

		System.out.println(ht);

	}}
