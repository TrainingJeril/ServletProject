package com.test.java;

public class ArrayIndexOutOfBound {

	
	public static void main(String[] args) {
		
		
		int ar[] = new int[5];
		
		ar[0] = 10;
		ar[1] =20;
		ar[2] = 30;
		
		System.out.println(ar[5]);
	}
}
