package com.vijay.garbagereflection;
import java.lang.reflect.Method;

public class ClassMethodsUsingReflection {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
