package com.vijay;

class MyResource implements AutoCloseable {
	public MyResource() {
		System.out.println("Resource Opened ...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resource Closing ...");
	}
}

// AutoCloseable is an interface in Java whose objects can be closed automatically 
// When used inside a try-with-resources block.
public class AutoCloseableExample {
	public static void main(String[] args) throws Exception {
		try (MyResource resource = new MyResource()) {
			System.out.println("Using Resource !!!");
		}
	}
}

