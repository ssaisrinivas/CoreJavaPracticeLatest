package com.sai.core.java.java8programs;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		
		int number = 12345;
		int sum=0;
		
		sum=String.valueOf(number).chars().map(Character::getNumericValue).sum();
		
		
		/*
		 * while(number > 0) {
		 * 
		 * sum = sum+ number%10;
		 * 
		 * number =number/10;
		 * 
		 * }
		 */
		
		System.out.println("Sum of the Given Digits is :" +sum);
		
	}

}
