package com.sai.core.java.java8programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirdLongestWord {
	
	public static void main(String[] args) {
		
		

		List<String> list = new ArrayList<>();
		list.add("flying");
		list.add("mango");
		list.add("ball");
		list.add("got");
		list.add("elephant");
		
		 Collections.sort(list, (s1, s2) -> s2.length() - s1.length());
		System.out.println(list.toString());
		
		System.out.println(list.stream().sorted(Comparator.comparingInt(String::length).reversed()).skip(list.size()-3).findFirst().get());
		
	}

}
