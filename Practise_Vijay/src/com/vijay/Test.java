package com.vijay;

import java.util.Scanner;
import com.vijay.inherit.InheritExample;
import com.vijay.inherit.InheritExample1;

public class Test {
	//here i am declaring a instance variable, instance variables we can't call in static methods
	//instance variables we can access in instance methods
	int a;
	
	static char c;
	static byte b;
	static short s;
	static long l;
	static double d;
	static float f;
	static boolean m;
	
	// global variable have default values but local variables not have default
	// values we have to initialize
	public static void main(String[] args) {
		//instance variable we can't access in static method
		//System.out.println(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
        String s=sc.next();
        System.out.println(s);
        System.out.println("enter first num");
        int first=sc.nextInt();
        System.out.println("enter first num");
        int second=sc.nextInt();
        System.out.println("sum:" +(first+second));
		System.out.println("=========================");
		
		//AbstarctExample ab= new AbstarctExample();
		
		//here we are calling static method so static methods acnt be overriden
		//InheritExample inex=new InheritExample();
		//inex.
		
		String v="vijay";
		System.out.println(v);
         v="jay";
 		System.out.println(v);
     
		String name=new String("kk");
 		System.out.println(name);
         name="jj";
  		System.out.println(name);
		
  		System.out.println("=========================");

  		String first1="vijay";
		String second1=new String("vijay");
  		System.out.println(first1);
  		System.out.println(second1);
  		System.out.println(first1==second1);        //false
  		System.out.println(first1.equals(second1)); //true

  		
  		
  		
  		

  		
  		
  		
  		
		
		System.out.println("======In for each loop=======");

		int arr[]= {100,200,300,400};
		for(int x:arr) {
			System.out.println(x);
		}
	    
		System.out.println("======Out for each loop=======");

		OopsConcepts oop=new OopsConcepts();
		oop.getA();		
		
		if(first<second) {
        	for(int i=first;i<=second;i++) {
        		System.out.println(i);
        	}
        	}else {
        		 for (int i=first; i>=second; i--) {
                     System.out.println(i);
                 }
        	}
		System.out.println("=======range=========");

        
        
       
		Loops loop=new Loops();
        loop.sum();

		loop.loop();
		
		System.out.println("======for loop before======");
		//instance variables we can access by creating a class object
		Test i=new Test();
		System.out.println(i.a);
		System.out.println("=========================");
		
		Test2 t = new Test2();
		System.out.println(t.x);
		System.out.println(t.y);

		System.out.println("=========================");
		t.x = 50;
		t.y = 60;
		System.out.println(t.x);
		System.out.println(t.y);

		System.out.println("=========================");

		Test2 t1 = new Test2();
		// instance variable accessing so updated value prints , bcz it stick to class
		System.out.println(t1.x);
		// instance variable accessing so same value prints , bcz it stick to object
		System.out.println(t1.y);
		

		
		System.out.println("=========================");
		  Test ts = new Test();
		  ts.switchTest("sunday"); 	
		  ts.switchTest("monday");
	}
	
		public void switchTest(String value) {
			
			//System.out.println(a);

           	switch(value) {
		        case "sunday":
		            System.out.println("sunday");
		            break;
		        case "monday":
		            System.out.println("monday");
		            break;
		        default:
		            System.out.println("no day");
		            break;
	     }
		  int k=1;
		  while(k<6) {
			  System.out.println(k);
			  k++;
		  }
		  
		  System.out.println("=========================");
		  
		  int j=1;
		  do {
			  System.out.println(j);
			  j++;
		  }while(j<5);

System.out.println("For Loop=========================");	
for(int i=1;i<=10;i++) {
	System.out.println(i);
}
	

//int z;
//	 Test t= new Test(); 
//	 System.out.println(t.a);
//	 System.out.println(t.b);

//from here to print default values		
//	 System.out.println(b);
//     System.out.println(s);
//     System.out.println(l);
//     System.out.println(d);
//     System.out.println(f);
//     System.out.println(m);
//     System.out.println(c);
//     System.out.println(z);

}
}












