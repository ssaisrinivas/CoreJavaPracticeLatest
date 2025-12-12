package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6,5};
		
		//boolean check = false;
		
		
		boolean hasDuplicate = Arrays.stream(numbers).distinct().count() != numbers.length;
		
		System.out.println("Array Contains Duplicate !!! :"+ hasDuplicate);
		
		
		
		
		
		/*
		 * 
		 * Set<Integer> numSet = new HashSet<Integer>();
		 * boolean check = Arrays.stream(numbers).allMatch(ele -> numSet.add(ele));
		 * 
		 * 
		 * if (check == false) System.out.println("Array Contains Duplicate !!!");
		 * 
		 * else System.out.println("Array Not Contains Duplicate !!!");
		 */
		
		
		
		
		
		/*
		 * for (int i = 0; i < numbers.length; i++) {
		 * 
		 * if (numSet.add(numbers[i])) { check = false; }
		 * 
		 * else { check = true; } }
		 * 
		 * if (check == true) System.out.println("Array Contains Duplicate !!!"); else
		 * System.out.println("Array Not Contains Duplicate !!!");
		 */

	}
}
