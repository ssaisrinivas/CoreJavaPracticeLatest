package com.sai.core.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CollectionPractice {
	
	Predicate<String> p;
	
	public static void main(String[] args) {
		
		//List
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		Integer[] intarr= new Integer[] {70,40,90,20,100,0,50,75,100,40,20,0};
		
		 Object[] array = Arrays.stream(intarr).collect(Collectors.toSet()).toArray();
		Arrays.sort(array);
		
		for (Object integer : array) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		list1.add("Doll");
		list1.add("Apple");
		list1.add("Elephant");
		list1.add("Ball");
		list1.add("Apple");
		list1.add("Elephant");
		list1.add("Cat");
		//	System.out.println(list1.size());
			
		//	list1.forEach(System.out::println);
		
		Arrays.stream(list1.toArray()).collect(Collectors.toSet()).forEach(System.out::println);;
		
		 
		 Set<String> seenElements = new HashSet<>();

		List<String> filterList = list1.stream().filter( element -> seenElements.add(element)).toList();
		
		System.out.println();
		//list1.stream().collect(Collectors.toSet()).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//filterList.forEach(System.out::println);
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		for (String string : list1) {
			
			if(!list2.contains(string)) {
			list2.add(string);
			}
		}
		
		//System.out.println(list2);
		
	}
}
