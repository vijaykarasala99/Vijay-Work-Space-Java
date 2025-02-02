package com.vijay.oopconcepts;
public class AccessModifiers {
    public String publicVar = "Public";
    private String privateVar = "Private";
    protected String protectedVar = "Protected";
    String defaultVar = "Default";

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.display();
    }
}
