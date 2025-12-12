package com.sai.core.java.java8programs;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "cba";
		boolean areAnagram = areAnagram(str1,str2);
		
		System.out.println("Given String is a Anagram ?" + areAnagram);
		
		
	}
		
	static boolean areAnagram(String str1 , String str2) {
		
	if(str1.length() != str2.length()) {
		
		return false;
	}		
	
	return str1.chars().mapToObj(c -> (char)c).sorted().toList().equals(str2.chars().mapToObj(c -> (char)c).sorted().toList());
	
	
	
	/*
	 * char[] charArr1 = str1.toCharArray(); char[] charArr2 = str2.toCharArray();
	 * Arrays.sort(charArr1); Arrays.sort(charArr2);
	 * 
	 * 
	 * 
	 * return Arrays.equals(charArr1, charArr2);
	 */
		}
		
	

}
