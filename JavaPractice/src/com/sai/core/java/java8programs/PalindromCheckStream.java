package com.sai.core.java.java8programs;

import java.util.stream.IntStream;

public class PalindromCheckStream {

	
	public static void main(String[] args) {
		
		String input ="madam";
		
		boolean isPalindrom = IntStream.range(0, input.length()/2)
		.allMatch(i -> input.charAt(i) == input.charAt(input.length()-1-i));
		
		System.out.println("Is Palindrom ? " + isPalindrom);
		
		
		/*
		 * int length = input.length();
		 * 
		 * for(int i=1;i<length/2;i++) {
		 * 
		 * if(input.charAt(i)!=input.charAt(length-1-i)) {
		 * 
		 * System.out.println("Not a Palindrom !!"); return; } }
		 * 
		 * System.out.println("Its is Palindrom !!");
		 */
	}
}
