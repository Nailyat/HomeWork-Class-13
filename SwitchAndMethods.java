package com.syntax.HW13;

public class SwitchAndMethods {
	
	/*
	 * Task 4
	 * Create a method that will say Hello in different language based on the country
	 *  that will passed when method is executed.
	 */

	void printHello(String country) {
		
		switch(country) {
		case "USA":
			System.out.println("Hello");
			break;
		case "Spain":
			System.out.println("Hola");
			break;
		case "Turkey":
			System.out.println("Merhaba");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Kazakhstan":
			System.out.println("Salem");
			break;
			default:
				System.out.println("Invalid country name");
		}
	}
}
