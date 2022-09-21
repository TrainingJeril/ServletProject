package com.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoundElement {

	
	public static void main(String[] args) {
		List<String> li1 = new ArrayList<String>();
		
		li1.add("Bike");
		li1.add("Car");
		li1.add("Bus");
		li1.add("Cycle");
		li1.add("lorry");

		
		System.out.println("List 1:"+li1);
		
		List<String> li2 = new ArrayList<String>();
		
		li2.add("A");
		li2.add("B");
		li2.add("C");
		li2.add("D");
		li2.add("E");

		
		System.out.println("List 2 :"+li2);
		
		Collections.copy(li1, li2);
		  System.out.println("List1: " + li1);
		  System.out.println("List2: " + li2);
	}
}
		 
	
	

