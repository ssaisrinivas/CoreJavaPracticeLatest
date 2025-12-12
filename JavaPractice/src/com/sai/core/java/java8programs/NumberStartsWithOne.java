package com.sai.core.java.java8programs;

import java.util.List;

public class NumberStartsWithOne {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,20,30,19,38,5,16,11,38,12);
		
		list.stream().filter(val -> String.valueOf(val).startsWith("1")).forEach(System.out::println);
		//list.stream().filter(val -> !String.valueOf(val).startsWith("1")).forEach(System.out::println);
		//list.stream().filter(val -> val.toString().startsWith("1")).forEach(System.out::println);
		//list.stream().filter(val -> (val+" ").startsWith("1")).forEach(System.out::println);
		
	}

}
