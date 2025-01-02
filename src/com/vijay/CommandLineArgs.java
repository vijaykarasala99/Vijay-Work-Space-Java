package com.vijay;

public class CommandLineArgs {
//Command line arguments are inputs you provide to a program when you run it from the command line.
//How to Run: run-configurations>> arguments>> program-arguments >> give values and run
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
