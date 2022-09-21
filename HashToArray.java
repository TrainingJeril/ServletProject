package com.test.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashToArray {

	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>();
		
		h1.add("Nokia");
		h1.add("Iphone");
		h1.add("Samsung");
		h1.add("Oppo");
		h1.add("Mi");
		
		System.out.println("Original Elements :" +h1);
		 
List<String> list = new ArrayList<String>(h1);


		System.out.println(list);
		
		
	}
}
