package com.sai.core.java.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEmployeeBasedOnAge {
	
	
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList( new Employee(101, "Sai", 10000.0, "Software Engineer", 32),
		 new Employee(103, "Srinivas", 30000.0, "CS", 32),
		 new Employee(102, "Venkat", 7000.00, "Teacher", 40),
		 new Employee(104, "Kiran", 20000.00, "Lawyer", 26),
		new Employee(106, "Pardhu", 3000.00, "Police", 26),
		 new Employee(105, "Mohan", 30000.00, "Doctor", 40));
		
		
		Map<Integer, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		
		collect.forEach((k,v) -> {System.out.println("Age is :" + k);
		System.out.println("Employes Name's are :" );
		v.stream().forEach(e -> System.out.println(e.getEmpName()));
		
			/*
			 * for(Employee e:v) { System.out.println( e.getEmpName()); }
			 */
		System.out.println();
		});
	}

}
