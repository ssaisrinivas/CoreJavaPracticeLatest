package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;

public class FirstOddNumber {

	
	public static void main(String[] args) {
		
		
		List<Integer> intList = Arrays.asList(2,4,8,7,10,12,15);
		
		int val = intList.stream().filter(num -> num%2 != 0).findFirst().get();
		
		System.out.println(val);
	}
}
