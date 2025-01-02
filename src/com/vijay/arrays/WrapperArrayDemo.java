package com.vijay.arrays;

public class WrapperArrayDemo {
    public static void main(String[] args) {
       
        Boolean[] boolArray = {Boolean.TRUE, Boolean.FALSE, null};
      
        Integer[] intArray = {1, 2, 3, null};
       
        Double[] doubleArray = {1.1, 2.2, null, 4.4};
      
        Character[] charArray = {'A', 'B', null, 'D'};
      
        Long[] longArray = {100000L, 200000L, null};
      
        Float[] floatArray = {1.59f, 2.5f, null};
      
        Short[] shortArray = {100, 200, null};
  
        Byte[] byteArray = {10, 20, null};

        System.out.println("Boolean Array: ");
        for (Boolean b : boolArray) System.out.println(b);

        System.out.println("\nInteger Array: ");
        for (Integer i : intArray) System.out.println(i);

        System.out.println("\nDouble Array: ");
        for (Double d : doubleArray) System.out.println(d);

        System.out.println("\nCharacter Array: ");
        for (Character c : charArray) System.out.println(c);

        System.out.println("\nLong Array: ");
        for (Long l : longArray) System.out.println(l);

        System.out.println("\nFloat Array: ");
        for (Float f : floatArray) System.out.println(f);

        System.out.println("\nShort Array: ");
        for (Short s : shortArray) System.out.println(s);

        System.out.println("\nByte Array: ");
        for (Byte b : byteArray) System.out.println(b);
    }
}
