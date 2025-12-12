package com.sai.core.java;

import java.util.Arrays;

public class AnagramofStrings {
	public static boolean areAnagrams(String str1, String str2) {
	       
		 str1 = str1.toLowerCase().replaceAll("\\n","");		 
		 str2 = str2.toLowerCase().replaceAll("\\n","");	
		 
		 if(str1.length() != str2.length()) {return false;}
		 
		 char[] firstString = str1.toCharArray();
		 char[] secondString = str2.toCharArray();
		 
		 Arrays.sort(firstString);
		 Arrays.sort(secondString);

		 return Arrays.equals(firstString, secondString);
	    }

	    public static void main(String[] args) {
	        String s1 = "Listen";
	        String s2 = "Silent";
	        String s3 = "Hello";
	        String s4 = "World";

	        System.out.println("'" + s1 + "' and '" + s2 + "' are anagrams: " + areAnagrams(s1, s2)); // true
	        System.out.println("'" + s3 + "' and '" + s4 + "' are anagrams: " + areAnagrams(s3, s4)); // false
	        System.out.println("'Debit Card' and 'Bad Credit' are anagrams: " + areAnagrams("Debit Card", "Bad Credit")); // true
	    }
}
