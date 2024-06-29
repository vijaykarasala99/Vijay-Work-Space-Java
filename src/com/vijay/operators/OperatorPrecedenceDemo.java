package com.vijay.operators;

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        // Parentheses
        int a = (2 + 3) * 4;  // 20
        System.out.println("Parentheses: (2 + 3) * 4 = " + a);

        // Postfix
        int b = 5;
        System.out.println("Post-increment: b++ = " + b++);  // 5
        System.out.println("Post-decrement: b-- = " + b--);  // 6

        // Unary
        int c = 5;
        System.out.println("Pre-increment: ++c = " + ++c);  // 6
        System.out.println("Pre-decrement: --c = " + --c);  // 5
        System.out.println("Unary plus: +c = " + +c);  // 5
        System.out.println("Unary minus: -c = " + -c);  // -5
        System.out.println("Bitwise complement: ~c = " + ~c);  // -6
        System.out.println("Logical NOT: !true = " + !true);  // false
       
        int d = (int) 5.5;
        System.out.println("Type cast: (int) 5.5 = " + d);  // 5

        // Multiplicative
        System.out.println("Multiplication: 2 * 3 = " + (2 * 3));  // 6
        System.out.println("Division: 10 / 2 = " + (10 / 2));  // 5
        System.out.println("Modulo: 10 % 3 = " + (10 % 3));  // 1

        // Additive
        System.out.println("Addition: 2 + 3 = " + (2 + 3));  // 5
        System.out.println("Subtraction: 5 - 3 = " + (5 - 3));  // 2

        // Shift
        System.out.println("Left shift: 2 << 1 = " + (2 << 1));  // 4
        System.out.println("Right shift: 4 >> 1 = " + (4 >> 1));  // 2
        System.out.println("Unsigned right shift: -4 >>> 1 = " + (-4 >>> 1));  // 2147483646

        // Relational
        System.out.println("Less than: 2 < 3 = " + (2 < 3));  // true
        System.out.println("Less than or equal: 2 <= 2 = " + (2 <= 2));  // true
        System.out.println("Greater than: 3 > 2 = " + (3 > 2));  // true
        System.out.println("Greater than or equal: 3 >= 3 = " + (3 >= 3));  // true
        String str = "Hello";
        System.out.println("Instanceof: str instanceof String = " + (str instanceof String));  // true

        // Equality
        System.out.println("Equal to: 3 == 3 = " + (3 == 3));  // true
        System.out.println("Not equal to: 3 != 2 = " + (3 != 2));  // true

        // Bitwise AND
        System.out.println("Bitwise AND: 3 & 2 = " + (3 & 2));  // 2

        // Bitwise XOR
        System.out.println("Bitwise XOR: 3 ^ 2 = " + (3 ^ 2));  // 1

        // Bitwise OR
        System.out.println("Bitwise OR: 3 | 2 = " + (3 | 2));  // 3

        // Logical AND
        System.out.println("Logical AND: true && false = " + (true && false));  // false

        // Logical OR
        System.out.println("Logical OR: true || false = " + (true || false));  // true

        // Ternary
        int e = 5;
        String result = (e > 3) ? "Greater" : "Lesser";
        System.out.println("Ternary: (e > 3) ? \"Greater\" : \"Lesser\" = " + result);  // Greater

        // Assignment
        int f = 5;
        f += 2;
        System.out.println("Addition assignment: f += 2 = " + f);  // 7
        f -= 2;
        System.out.println("Subtraction assignment: f -= 2 = " + f);  // 5
        f *= 2;
        System.out.println("Multiplication assignment: f *= 2 = " + f);  // 10
        f /= 2;
        System.out.println("Division assignment: f /= 2 = " + f);  // 5
        f %= 2;
        System.out.println("Modulo assignment: f %= 2 = " + f);  // 1
        f <<= 2;
        System.out.println("Left shift assignment: f <<= 2 = " + f);  // 4
        f >>= 1;
        System.out.println("Right shift assignment: f >>= 1 = " + f);  // 2
        f >>>= 1;
        System.out.println("Unsigned right shift assignment: f >>>= 1 = " + f);  // 1
        f &= 1;
        System.out.println("Bitwise AND assignment: f &= 1 = " + f);  // 1
        f ^= 1;
        System.out.println("Bitwise XOR assignment: f ^= 1 = " + f);  // 0
        f |= 2;
        System.out.println("Bitwise OR assignment: f |= 2 = " + f);  // 2
    }
}
