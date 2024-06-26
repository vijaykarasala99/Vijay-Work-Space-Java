package com.vijay.eightfeatures;
import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private transient String password;      // transient variable

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
    }
}

public class TransientExample {
	
    public static void main(String[] args) {
    User user = new User("john_doe", "secretpassword");

        // Serialize the user object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // De-serialize the user object from the file    
        User deserializedUser = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            deserializedUser = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the de-serialized user object
        System.out.println("Deserialized User: " + deserializedUser);
    }
}



