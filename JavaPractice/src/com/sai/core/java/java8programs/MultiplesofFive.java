package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;

public class MultiplesofFive {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 25, 30, 42, 50, 7, 15);

		asList.stream().filter(n -> n % 5 == 0).forEach(System.out::println);

	}
}
