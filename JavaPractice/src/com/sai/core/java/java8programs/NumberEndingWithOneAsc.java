package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;

public class NumberEndingWithOneAsc {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(150, 314, 121, 918, 71, 21, 54, 176, 11, 51, 89, 716, 5, 41, 71);

		asList.stream().filter(num -> num % 10 == 1).distinct().sorted().forEach(System.out::println);
		System.out.println();

		// one contains any where

	  asList.stream().filter(num -> String.valueOf(num).startsWith("1")).sorted().forEach(System.out::println);
		
	}

}
