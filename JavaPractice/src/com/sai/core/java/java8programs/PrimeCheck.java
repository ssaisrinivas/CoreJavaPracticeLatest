package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;

public class PrimeCheck {
	
	public static void main(String[] args) {
		
		
		List<Integer> list1 = Arrays.asList(1,5,17,2,4,92, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,7,20,41);
		
		list1.stream().
		filter(PrimeCheck::isPrime).sorted().distinct().forEach(System.out::println);;
		
	}
	
	
	public static boolean isPrime(int num) {
		
		if(num==1) return false;
		
		
		
		for (int i=2;i<=Math.sqrt(num);i++) {
		if(num % i==0) return false;
		}
		return true;
	}

}
