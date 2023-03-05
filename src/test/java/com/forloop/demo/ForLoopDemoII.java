package com.forloop.demo;

public class ForLoopDemoII {

	public static void main(String[] args) {

		//break is used to uquit the forloop on condition is true
		//continue is used to skip the forloop execution and go to the next iteration
		for (int i = 0; i < 5; i++) {
			if (i == 3) // 3 ==3
				continue;
			System.out.println("index value " + i);
		}

		System.out.println("I am outside forloop");

	}

}
