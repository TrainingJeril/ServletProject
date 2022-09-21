package com.test.java;

import java.util.LinkedList;

public class AddElement {

	
	public static void main(String[] args) {
		
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("Bike");
		li.add("Bus");
		li.add("Car");
		
		System.out.println("OriginalList:"+li);
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Cycle");
		list.add("Lorry");
		
		li.addAll(list);
		System.out.println("Added list:"+li);
		
		
	}
}
