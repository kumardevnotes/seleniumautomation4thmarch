package com.java.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		String empName = "John Legend";

		displayEmpName("James Cameron", false);
		
		displayEmpName(true, "Kumar T");
		
		int empSalary = getEmpSal();
		System.out.println(empSalary);
		
		empSalary = getEmpSal(200000);
		System.out.println(empSalary);

		// Calling a method
//		displayEmpName();
//		displayEmpName(empName);
//		
//		displayEmpName();
//		displayEmpName("James Cameron");
	}

	// Declaring a method
	public static void displayEmpName() {
		System.out.println("Mike Miller");
	}

	// Declaring a method
	public static void displayEmpName(String empName) {
		System.out.println(empName);
	}

	// Declaring a method
	public static void displayEmpName(String empName, boolean empMarStatus) {
		if (empMarStatus) {
			System.out.println("Emp is married and his name is " + empName);
		} else {
			System.out.println("Emp is unmarried and his name is " + empName);
		}
	}
	
	public static void displayEmpName(boolean empMarStatus, String empName) {
		if (empMarStatus) {
			System.out.println("Emp is married and his name is " + empName);
		} else {
			System.out.println("Emp is unmarried and his name is " + empName);
		}
	}

	//Declaring a method with return type int
	public static int getEmpSal() {
		return 10000;
	}
	
	public static int getEmpSal(int salary) {
		return salary;
	}
	
}
