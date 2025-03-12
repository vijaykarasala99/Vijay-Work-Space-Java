package com.vijay.oops;
class OverloadTest {
	//The most specific method is chosen. String is more specific than Object.
    void test(Object obj) {
        System.out.println("Object method");
    }

    void test(String str) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        OverloadTest obj = new OverloadTest();
        obj.test(null); // Output: String method
    }
}
