package com.vijay;

public class Loops {
	
	public int loop() {
		for(int i=100;i>=0;i--) {
			System.out.println(i);
		}
		return 0;
	}

	int sum=0;
	public int sum() {
		for(int i=0;i<=10;i++) {
		sum=sum+i;	
		}
		System.out.println(sum);
		return sum;
	}
   
    public int whileloop() {
    int i=0;	
	while(i<10) {
		i++;
	}
	return 0;
    }
}
