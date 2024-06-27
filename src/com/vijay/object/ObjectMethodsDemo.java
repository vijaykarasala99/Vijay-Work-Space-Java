package com.vijay.object;

public class ObjectMethodsDemo {
	
	public static void main(String[] args) {

		MyObject obj1 = new MyObject("Object1");
		MyObject obj2 = new MyObject("Object2");
		
		MyObject obj3 = obj1;
		try {
		MyObject obj4 = (MyObject) obj1.clone();
		System.out.println("================");
		System.out.println(obj4);
		}catch(CloneNotSupportedException e) {
	    e.printStackTrace();
	    e.getMessage();
	    }
		
		System.out.println("================");
		// toString is called to return string representation of object
		System.out.println("obj1.toString(): " + obj1.toString());

		// equals
		System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
		System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));

		// hashCode
		System.out.println("obj1.hashCode(): " + obj1.hashCode());
		System.out.println("obj2.hashCode(): " + obj2.hashCode());
		System.out.println("obj3.hashCode(): " + obj3.hashCode());

		// getClass
		System.out.println("obj1.getClass(): " + obj1.getClass().getName());

		// clone (This requires the class to implement Cloneable and override clone
		// method)
		try {
			MyObject obj5 = (MyObject) obj1.clone();
			System.out.println("Cloned obj1 to obj5: " + obj5);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// notify, notifyAll, wait - these are demonstrated with threads
		Thread thread = new Thread(() -> {
			synchronized (obj1) {
				try {
					System.out.println("Thread waiting on obj1...");
					obj1.wait(20);
					System.out.println("Thread resumed after wait on obj1...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread.start();

		synchronized (obj1) {
			try {
				System.out.println("Main thread sleeping for 2 seconds...");
				Thread.sleep(20);
				System.out.println("Main thread notifying waiting thread...");
				obj1.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// finalize - called by garbage collector, hard to demonstrate directly
		System.gc();
	}
}

class MyObject implements Cloneable {
	
	private String name;

	public MyObject(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyObject{name='" + name + "'}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		MyObject myObject = (MyObject) obj;
		return name.equals(myObject.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("MyObject " + name + " is being finalized.");
		super.finalize();
	}

}
