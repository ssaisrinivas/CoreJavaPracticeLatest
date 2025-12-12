package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordofString {

	public static void main(String[] args) {
		
		String str =  "Code can become more concise";
		
		String strArray[] = str.split(" ");
		
		String reverseSentance = Arrays.stream(strArray).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		
		//.forEach(w -> System.out.print(w + "\s"));
		
		System.out.println(reverseSentance);
		
		
	}
	
}
