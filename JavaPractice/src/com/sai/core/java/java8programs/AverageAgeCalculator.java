package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageAgeCalculator {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList( new Employee(101, "Sai", 10000.0, "Software Engineer", 32),
				 new Employee(103, "Srinivas", 30000.0, "CS", 32),
				 new Employee(102, "Venkat", 7000.00, "Teacher", 40),
				 new Employee(104, "Kiran", 20000.00, "Lawyer", 26),
				new Employee(106, "Pardhu", 3000.00, "Police", 26),
				 new Employee(105, "Mohan", 30000.00, "Doctor", 40));
			
		OptionalDouble average = empList.stream().mapToInt(Employee::getAge).average();
		
		System.out.println(average.getAsDouble());
		System.out.println();
		//or
		
		Double collect = empList.stream().collect(Collectors.averagingInt(Employee::getAge));
		
		System.out.println(collect);
	}
}
