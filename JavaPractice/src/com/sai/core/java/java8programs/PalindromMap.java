package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PalindromMap {

	public static void main(String[] args) {

		List<String> asList1 = Arrays.asList("level", "madam", "madam", "apple", "radar", "radar", "bannana");

		Map<String, Boolean> palindromMap = asList1.stream().distinct().collect(
				Collectors.toMap(key -> key, value -> value.equals(new StringBuilder(value).reverse().toString())));

		palindromMap.forEach((k, v) -> System.out.println("Key :> " + k + "\n Palindrom ? > " + v));

		System.out.println();
		System.out.println(palindromMap);

		
		Map<Character, List<String>> charToString = asList1.stream()
				.collect(Collectors.groupingBy(str -> str.charAt(0)));

		System.out.println(charToString);

	}

}
