package com.sai.core.java.java8programs;

import java.util.ArrayList;
import java.util.List;

public class StringStartsWithNumber {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("1alian");
		list.add("zeebra");
		list.add("3elephant");
		
		list.stream().filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0))).forEach(System.out::println);;
	}

}
