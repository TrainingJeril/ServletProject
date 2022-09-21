package com.test.java;

public class EmployeeDetails implements CarDetails {

	@Override
	public void car1() {
System.out.println("BMW");		
	}

	@Override
	public void car2() {
System.out.println("ferrai");		
	}

	@Override
	public void car3() {
System.out.println("i10");		
	}

	public static void main(String[] args) {
		
		
		EmployeeDetails e = new EmployeeDetails();
		
		e.car1();
		e.car2();
		e.car3();
	}
	}

