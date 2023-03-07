package com.javaclasses.demo;

public class JavaConstructDemo {

	// constructor is a special member fucntion whose name is same as class name
	// constructor is called as soon as you create an object of the class
   // default constructor -  without params
	JavaConstructDemo() {
		System.out.println("I am default constructor");
	}

	// String parameterized constructor
	JavaConstructDemo(String message) {
		System.out.println("Hello All! " + message);
	}

	// int parameterized constructor
	JavaConstructDemo(int schooldRegID) {
		System.out.println("SchoolReg ID is " + schooldRegID);
	}

	public static void main(String[] args) {
		JavaConstructDemo abc = new JavaConstructDemo();
		System.out.println(abc.getStdID());
		abc.displayStdName();

		System.out.println();

		JavaConstructDemo obj2 = new JavaConstructDemo("How are you ?");
		System.out.println(obj2.getStdID());
		obj2.displayStdName();

		System.out.println();

		JavaConstructDemo obj3 = new JavaConstructDemo(4445535);
		System.out.println(obj3.getStdID());
		obj3.displayStdName();
	}

	// non-static
	public int getStdID() {
		return 1222;
	}

	// non-static
	public void displayStdName() {
		System.out.println("John Miller");
	}
}
