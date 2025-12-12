package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestStringinList {

	public static void main(String[] args) {
		
		
		List<String> asList = Arrays.asList("apple","banana","mango","orange","cucumber","tomato");
		
		
	//asList.stream().sorted(Comparator.comparing(String::length)).skip(asList.size()-1).forEach(System.out::println);
		
		Optional<String> max = asList.stream().max(Comparator.comparing(String::length));
		
		max.ifPresent(System.out::println);
	}
	
	
}
