package com.vijay.reflection;

import java.lang.reflect.Method;

class Secret {
    private void showMessage() {
        System.out.println("Private method called!");
    }
}

public class AccessPrivateMethod {
    public static void main(String[] args) throws Exception {
        // Create object
        Secret secret = new Secret();

        // Get the 'showMessage' method
        Method method = secret.getClass().getDeclaredMethod("showMessage");

        // Make private method accessible
        method.setAccessible(true);

        // Call the private method
        method.invoke(secret);
    }
}


