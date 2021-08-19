package com.syntax.HW13;

public class ReturnMethod {

	/*
	 * Write a method to return whether given number is prime or not
	 */
	
	boolean isPrime(int number) {
		if(number>1) {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
}
