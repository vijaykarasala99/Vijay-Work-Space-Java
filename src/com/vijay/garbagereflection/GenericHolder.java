package com.vijay.garbagereflection;
public class GenericHolder<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setValue("Hello Generics");
        System.out.println("Value: " + stringHolder.getValue());

        GenericHolder<Integer> intHolder = new GenericHolder<>();
        intHolder.setValue(100);
        System.out.println("Value: " + intHolder.getValue());
    }
}
