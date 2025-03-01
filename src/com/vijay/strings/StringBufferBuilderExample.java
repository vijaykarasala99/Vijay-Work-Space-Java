package com.vijay.strings;

public class StringBufferBuilderExample {
    public static void main(String[] args) {
        
        // Using StringBuffer
        StringBuffer sbuf = new StringBuffer("Hello");
        System.out.println("StringBuffer Example:");

        // 1. append()
        sbuf.append(" World");
        System.out.println("After append: " + sbuf);

        // 2. insert()
        sbuf.insert(5, " Java");
        System.out.println("After insert: " + sbuf);

        // 3. reverse()
        sbuf.reverse();
        System.out.println("After reverse: " + sbuf);

        // 4. replace()
        sbuf.replace(0, 5, "Hi");
        System.out.println("After replace: " + sbuf);

        // 5. capacity()
        System.out.println("Capacity: " + sbuf.capacity());

        // 6. substring()
        String substring = sbuf.substring(3);
        System.out.println("Substring: " + substring);

        // 7. charAt()
        char ch = sbuf.charAt(3);
        System.out.println("Character at index 3: " + ch);

        // 8. length()
        System.out.println("Length: " + sbuf.length());

        // 9. setLength()
        sbuf.setLength(10);
        System.out.println("After setLength: " + sbuf);

        // 10. delete()
        sbuf.delete(3, 7);
        System.out.println("After delete: " + sbuf);

        // 11. deleteCharAt()
        sbuf.deleteCharAt(2);
        System.out.println("After deleteCharAt: " + sbuf);

        // 12. indexOf()
        System.out.println("Index of 'a': " + sbuf.indexOf("a"));

        // 13. lastIndexOf()
        System.out.println("Last index of 'a': " + sbuf.lastIndexOf("a"));

        // 14. toString()
        System.out.println("StringBuffer toString: " + sbuf.toString());

        // Using StringBuilder (same methods, but not thread-safe)
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("\nStringBuilder Example:");

        // 1. append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 4. replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 5. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 6. substring()
        String subStr = sb.substring(3);
        System.out.println("Substring: " + subStr);

        // 7. charAt()
        char charAtIndex = sb.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex);

        // 8. length()
        System.out.println("Length: " + sb.length());

        // 9. setLength()
        sb.setLength(10);
        System.out.println("After setLength: " + sb);

        // 10. delete()
        sb.delete(3, 7);
        System.out.println("After delete: " + sb);

        // 11. deleteCharAt()
        sb.deleteCharAt(2);
        System.out.println("After deleteCharAt: " + sb);

        // 12. indexOf()
        System.out.println("Index of 'a': " + sb.indexOf("a"));

        // 13. lastIndexOf()
        System.out.println("Last index of 'a': " + sb.lastIndexOf("a"));

        // 14. toString()
        System.out.println("StringBuilder toString: " + sb);
    }
}
