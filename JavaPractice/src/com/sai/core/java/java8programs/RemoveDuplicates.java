package com.sai.core.java.java8programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("ball");
		list.add("mango");
		list.add("apple");
		
		list.stream().distinct().forEach(System.out::println);
		
		//list.stream().collect(Collectors.toSet()).forEach(System.out::println);
		
		// new HashSet<>(list).stream().forEach(System.out::println);
	}

}
