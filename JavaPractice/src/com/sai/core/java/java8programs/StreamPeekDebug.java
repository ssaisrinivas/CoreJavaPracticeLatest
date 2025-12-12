package com.sai.core.java.java8programs;

import java.util.ArrayList;
import java.util.List;

public class StreamPeekDebug {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("alian");
		list.add("zeebra");
		list.add("ball");
		list.add("violet");
		list.add("orange");
		list.add("arms");
		list.add("cat");
		
		List<String> list2 = list.stream()
				.peek(word -> System.out.println("Original " + word +"\n"))
				.filter(l -> l.startsWith("a"))
				.peek(word -> System.out.println("After Filter " + word +"\n"))
				.map(String::toUpperCase)
				.peek(word -> System.out.println("After UpperCase " + word +"\n"))
				.toList();
		
		//list2.forEach(System.out::println);
	}

}
