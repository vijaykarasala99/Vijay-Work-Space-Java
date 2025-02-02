package com.vijay.collection;
import java.util.HashMap;

class CustomKey {
    private int id;

    public CustomKey(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof CustomKey) && ((CustomKey) obj).id == this.id;
    }
}

class CustomValue {
    private String value;

    public CustomValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        HashMap<CustomKey, CustomValue> map = new HashMap<>();
        map.put(new CustomKey(1), new CustomValue("Apple"));
        map.put(new CustomKey(2), new CustomValue("Banana"));

        System.out.println("Custom HashMap: " + map);
    }
}
