package com.test.java;

import java.util.Iterator;

public class EqualityChecking {

	static void  equality_checking_two_arrays(int[] array1, int[] array2)
	  {
	  boolean  equalOrNot = true;
	  
	  if(array1.length == array2.length)
	  {
	  for (int i  = 0; i < array1.length; i++)
	  {
	  if(array1[i] != array2[i])
	  {
	  equalOrNot = false;
	  }
	  }
	  }
	  else
	  {
	  equalOrNot  = false;
	  }
	  
	  if  (equalOrNot)
	  {
	  System.out.println("Two arrays are equal.");
	  }
	  else
	  {
	  System.out.println("Two  arrays are not equal.");
	  }
	  }
	  
	  public static void  main(String[] args)
	  {
	  int[] array1 =  {2, 5, 7, 9, 11};
	  int[] array2 =  {2, 5, 7, 9, 11};
	  int[] array3 =  {2, 5, 7, 9, 11};
	  
	  equality_checking_two_arrays(array1,  array2);
	  equality_checking_two_arrays(array1, array3);
	  }
	  }
	

