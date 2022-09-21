package com.test.java;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> com = new ArrayList<>();
		int ar1[]= {1,2,3};
		int ar2[]= {2,3,4};
		int ar3[]= {2,3,4,5};
		int a=0,b=0,c=0;
		
		while (a<ar1.length && b < ar2.length && c < ar3.length) {
			
			if(ar1[a] == ar2[b] && ar2[b] ==ar3[c]) {
				
				
				com.add(ar1[a]);
				a++;
				b++;
				c++;
			}
				
			else if (ar1[a] < ar2[b])
				a++;
			else if (ar2[b] < ar3[c])
				b++;
			
			else
				c++;
			
		}
			
			System.out.println(com);
	}
	
}
