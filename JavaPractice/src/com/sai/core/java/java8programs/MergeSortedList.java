package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedList {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(70,90,50,30,10,30,70);
		List<Integer> list2 = Arrays.asList(100,80,60,80,40,20,100);
		
		Set<Integer> mergedSortedList = Stream.concat(list1.stream(), list2.stream()).sorted((l1,l2) -> (l1<l2)? +1 : -1 ).collect(Collectors.toCollection(LinkedHashSet::new));
		mergedSortedList.forEach(System.out::println);
	}

}
