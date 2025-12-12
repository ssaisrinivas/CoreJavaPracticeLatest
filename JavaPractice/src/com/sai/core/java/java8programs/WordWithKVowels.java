package com.sai.core.java.java8programs;

import java.util.Arrays;

public class WordWithKVowels {
	
	public static void main(String[] args) {
		
		String str = "I have an elephant and oranges under my umberella for understanding aei  ";
		
		int k =3;
		
		Arrays.stream(str.split(" ")).filter(word -> countVowels(word)==k).forEach(System.out::println);
		
	}
	
	public static long countVowels(String word) {
		
	return 	word.chars().mapToObj(ch -> (char)ch).filter(ch -> "aeiouAEIOU".indexOf(ch)!=-1).count();
	}

}
