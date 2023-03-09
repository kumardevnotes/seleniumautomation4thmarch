package com.inheritance.demo;

public class ScopeDemo {
	
	//static block
	static {
		System.out.println("This will display on the top of everything");
	}

	//class level scope
	static int empSalary = 50000;
	
	public static void main(String[] args) {
		System.out.println(empSalary);
		empSalary = 30000;
		System.out.println(empSalary);
		displayEmpSalary();
		
		//local variable at method level scope
		String empName = "John Luther";
		System.out.println(empName);
		
		ScopeDemo obj = new ScopeDemo();
		obj.updateSalary(20000);
	}
	
	public static void displayEmpSalary() {
		System.out.println(empSalary);
		
		//System.out.println(empName);
	}
	
	//non-static
	public void updateSalary(int actualSalary) {
		//If you declare a local variable as shown below i.e method scope variable,
		//Then it will be considered as actual variable even though you have a 
		//same variable at calss scope
		int empSalary = actualSalary;
		empSalary =  empSalary+ 50000;
		System.out.println("udated salary is "+empSalary);
	}

}
