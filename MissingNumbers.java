package com.test.java;

public class MissingNumbers {

	
	public static void main(String[] args) {
		
		
		int a[] = {1,3,4,5};
		
		//1+3+4+5=13 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=15-13 =2 missing
		
	int sum1 = 0;
	for (int i=0;i<a.length;i++)
	{
		sum1=sum1+a[i];
	}
	
	System.out.println("Sum of elements in array is :"+sum1);
	
	
	int sum2=0;
	
	for (int i=1;i<=5;i++)
	{
		sum2 = sum2+i;
	}
	System.out.println("sum of range of elements in array:" +sum2);
	
	System.out.println("Missing number is " +(sum2-sum1));
	}
}
