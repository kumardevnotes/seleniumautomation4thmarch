package com.switchdemo;

public class SwitchDemo {

	public static void main(String[] args) {

		int personAge = 20;
		
		String day  = "SatttttDay";

		/*
		 * if (personAge == 20) { System.out.println("Age is 20"); } else if (personAge
		 * == 30) { System.out.println("Age is 30"); } else if (personAge == 40) {
		 * System.out.println("Age is 40"); } else System.out.println("Age is " +
		 * personAge);
		 */

		switch (personAge) {
		//case "Monday"
//		System.out.println("Monday");
//		break;
		case 20:
			System.out.println("Age is 20");
			break;
		case 30:
			System.out.println("Age is 30");
			break;
		case 40:
			System.out.println("Age is 40");
			break;
		default:
			System.out.println("Age is " + personAge);
		}
		
		System.out.println("outside switch block");

	}
}
