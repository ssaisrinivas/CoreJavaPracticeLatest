package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionExamles {
	
	public static void main(String[] args) {
		
		
		List<Integer> asList = Arrays.asList(2,4,6,7,10,9,3,5,1,8);
		
		Map<Boolean, List<Integer>> collect = asList.stream().collect(Collectors.partitioningBy(num -> num%2==0));
		
		System.out.println("Even Numbers are" + collect.get(true));
		System.out.println("Odd Numbers are" + collect.get(false));
		
	}

}
