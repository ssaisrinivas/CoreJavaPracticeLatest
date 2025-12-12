package com.sai.core.java.java8programs;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacterInString {

	public static void main(String[] args) {

		String str = "geeksforgeeksf";

/*		Map<String, Long> charToCount = Arrays.stream(str.split("")).filter(s -> !str.isEmpty())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		charToCount.forEach((t, u) -> {

			System.out.println("Characte is :" + t + "  Occurances count is: " + u);
		});*/
		
		str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((t, u) -> 
		  
		  System.out.println("Characte is :"+ t + "  Occurances count is: " +u));
		
		

		/*
		 * char[] charArray = str.toCharArray();
		 * 
		 * Map<Character, Integer> countMap = new HashMap<>();
		 * 
		 * for (char c : charArray) { countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		 * }
		 * 
		 * 
		 * countMap.forEach((t, u) -> {
		 * 
		 * System.out.println("Characte is :"+ t + "  Occurances count is: " +u);
		 * 
		 * 
		 * });
		 */
	}

}
