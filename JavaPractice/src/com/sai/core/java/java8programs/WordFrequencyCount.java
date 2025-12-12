package com.sai.core.java.java8programs;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class WordFrequencyCount {

	public static void main(String[] args) {
		
		
		List<String> asList = Arrays.asList("apple","banana","apple","orange","banana","apple");
		
		Map<String, Long> wordToCountMap = asList.stream().collect(groupingBy(Function.identity(),counting()));
		
		wordToCountMap.forEach((k,v) -> System.out.println("Word is :" + k + " : " +v));
		
		
		//or
		
		System.out.println();
		Map<String , Integer> wordMap = new HashMap<String, Integer>();
		
		for (String string : asList) {
			wordMap.put(string, wordMap.getOrDefault(string,0)+1);
		}
		
		System.out.println(wordMap.toString());
	}
}
