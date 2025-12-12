package com.sai.core.java.java8programs;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatisticsExample {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = List.of(1,20,30,19,38,5,16,11,38,12);
		
		IntSummaryStatistics summaryStatistics = list.stream().mapToInt(n -> n).summaryStatistics();
		
		System.out.println("Minimum " + summaryStatistics.getMin());
		System.out.println("Maximum " + summaryStatistics.getMax());
		System.out.println("Average " + summaryStatistics.getAverage());
		System.out.println("Sum " + summaryStatistics.getSum());
		System.out.println("Count " + summaryStatistics.getCount());
	}

}
