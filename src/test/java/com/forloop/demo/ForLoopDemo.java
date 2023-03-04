package com.forloop.demo;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) { // declaration; condition; increment
			//0 ; 0 < 6
			System.out.println("I am having 2 pens");
		}
		
		for (int i = 6; i > 0; i--) { // declaration; condition; decrement
			//5 ; 0 > 0
			System.out.println("I am having 2 pens");
		}
		
		String cities[] = {"Hyd", "Delhi", "Pune"}; // 0 1 length-1 = 3-1=2
		
		int empIds[] = {11, 22,22,333,45};
		
//		System.out.println(cities[0]);
//		System.out.println(cities[1]);
//		System.out.println(cities[2]);
		
		for (int i = 0; i <= cities.length-1; i++) { // declaration; condition; decrement
			//2 ; 2 <= 2
			System.out.println(cities[i]); //cities[2]
		}
	}

}
