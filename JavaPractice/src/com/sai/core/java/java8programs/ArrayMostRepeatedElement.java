package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayMostRepeatedElement {

	
	public static void main(String[] args) {
		
		int[] number = {1,2,3,2,4,6,3,5,7,3,6,8,3,2,1,4,3,7}; 
		
		Arrays.stream(number)
		.boxed()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.max(Comparator.comparingLong(Map.Entry::getValue))
		.map(Map.Entry::getKey)
		.ifPresent(elememt -> System.out.println("Most Repeated number is " + elememt));
		
	}
}
