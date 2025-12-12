package com.sai.core.java.java8programs;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String input = "swiss";
		
		
		Optional<Character> opt = 
				
				input.chars().mapToObj(ch -> (char)ch)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() ==1)
		.map(entry -> entry.getKey())
		.findFirst();
		
		if(opt.isPresent())		
		System.out.println("The First Non Repeated Character is : " + opt.get());
		
		
		
		
		/*
		 * char[] charArray = input.toCharArray();
		 * 
		 * Map<Character ,Integer> charMap = new HashMap<>();
		 * 
		 * for (char c : charArray) {
		 * 
		 * 
		 * charMap.put(c, charMap.getOrDefault(c, 0)+1); }
		 * 
		 * System.out.println(charMap.toString());
		 * 
		 * 
		 * for (Map.Entry<Character ,Integer> entry : charMap.entrySet()) {
		 * 
		 * for(char c : charArray) { if(entry.getValue()==1) {
		 * 
		 * System.out.println("First Non repeated Character is : " + entry.getKey());
		 * System.exit(0); }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		
	}

}
