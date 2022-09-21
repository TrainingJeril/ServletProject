package com.test.java;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer [] intArray = new Integer [list.size()];
		list.toArray(intArray);
		
		for (Integer integer : intArray) {
			System.out.println(integer);
		}
		
		
	}
}
