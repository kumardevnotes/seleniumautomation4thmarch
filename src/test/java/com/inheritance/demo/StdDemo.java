package com.inheritance.demo;

public class StdDemo extends SchoolDemo { //2 + 2 = 4

	public static void main(String[] args) {
		StdDemo obj  = new StdDemo(); //1MB
		obj.displayStdName();
		obj.displayStdID();
		obj.displaySchoolName();
		obj.displaySchoolregID();
	}
	
	public void displayStdName() {
		System.out.println("Maha");
	}
	
	public void displayStdID() {
		System.out.println(1000);
	}
	

}
