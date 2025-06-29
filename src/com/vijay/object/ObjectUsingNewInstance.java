package com.vijay.object;

import java.lang.reflect.Constructor;

class BBB {
    void show() {
        System.out.println("BBB class's show method...");
    }
}

public class ObjectUsingNewInstance {
    public static void main(String[] args) throws Exception {
        Constructor<BBB> constructor = BBB.class.getDeclaredConstructor();
       // BBB obj = constructor.newInstance(); // uses reflection
       // obj.show();
    }
}
