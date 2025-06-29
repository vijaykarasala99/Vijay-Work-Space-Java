package com.vijay.exceptions;

import java.io.IOException;

public class ExceptionA {
    void call() throws IOException {} // Superclass method throws IOException
}

class ExceptionB extends ExceptionA {
	/**
	
    void call() throws IOException {} // Allowed (same exception)

    void call() throws FileNotFoundException {} // Allowed (FileNotFoundException is a subclass of IOException)

    void call() {} // Allowed (no exception declared)

    void call() throws Exception {} // Not allowed (Exception is more general than IOException)
   
   */
	
 //	1.You cannot throw a broader exception than the superclass.

 //	2.You can throw a more specific exception or the same exception.

 //	3.You can choose not to throw any exception at all.    
	

}


