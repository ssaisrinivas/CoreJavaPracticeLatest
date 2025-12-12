package com.sai.core.java.java8programs;

import java.util.stream.IntStream;

public class SumofNaturalNumbers {
	
	public static void main(String[] args) {
		
		int n=10;
		
		int sum = IntStream.rangeClosed(0, n).sum();
		System.out.println("Sum offirst " + n +" natural number is :"+ sum); 
		
	}

}
