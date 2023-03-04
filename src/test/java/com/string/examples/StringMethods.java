package com.string.examples;

public class StringMethods {

	public static void main(String[] args) {
		String empName = "John Legend"; //0 1 2.... 11-1 = 10 ""
		
		System.out.println(empName);
		System.out.println(empName.toLowerCase());
		System.out.println(empName.toUpperCase());
		System.out.println(empName.charAt(5));
		System.out.println(empName.concat(" is from USA")); //John Legend is from USA
		System.out.println(empName.equals("john Legend")); //false
		System.out.println(empName.equalsIgnoreCase("john legend")); //true
		System.out.println(empName.endsWith("end")); //true
		System.out.println(empName.startsWith("ohn")); //false
		System.out.println(empName.contains("Legend")); //true or false
		System.out.println(empName.length()); //11
		System.out.println(empName.isEmpty()); //true
		System.out.println(empName.isBlank()); //true
		System.out.println(empName.replace('e', 'x'));
		System.out.println(empName.substring(5)); //Legend
	}

}
