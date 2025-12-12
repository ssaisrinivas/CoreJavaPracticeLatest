package com.sai.core.java.java8programs;

import java.util.stream.IntStream;

public class FirstTenEvenNumbers {
	
public static void main(String[] args) {

	IntStream.rangeClosed(2, 20).filter(num -> num%2==0 ).forEach(System.out::println);
}
}
