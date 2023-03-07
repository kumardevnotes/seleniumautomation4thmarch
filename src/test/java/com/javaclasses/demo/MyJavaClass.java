package com.javaclasses.demo;

public class MyJavaClass {

	public static void main(String[] args) {
		//To call a non-static method, create class object first and then using
        //that object, call the method
		MyJavaClass obj = new MyJavaClass();
		
		//int stdId = obj.getStdID();
		System.out.println(obj.getStdID());
		
		obj.displayStdName();
		
		displaySchoolName();
	}
	
	//non-static
	public int getStdID() {
		return 1222;
	}
	
	//non-static
	public void displayStdName() {
		System.out.println("John Miller");
	}
	
	//static method
	public static void displaySchoolName() {
		System.out.println("MOdel Public School");
	}

}
