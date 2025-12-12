package com.sai.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String args[]) {

		EmployeeService es = new EmployeeService();
		List<Employee> employeesList =es.getAllEmployees();
		
		//forEach
		
		//employeesList.stream().forEach(System.out::println);
		
		//filter
		
		//employeesList.stream().filter(e -> e.getEmpName().startsWith("S")).forEach(System.out::println);
		

		
		employeesList.stream().map(emp -> {
			
			if(emp.getProjects().stream().anyMatch(p -> p.getProjectTitle().contains("Cloud project")))
			return emp;
			
			return "";
			
		
		}).forEach(System.out::println);
		
		
		
		List<Integer> intList = Arrays.asList(10,20,40,60,80,2,10,20,40,60,80,2,10,20,40,60,80);
		//intList.forEach(System.out::println);
		
	
		//intList.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).forEach(System.out::println);;
		intList.stream().sorted((e1,e2) -> (e1>e2) ? +1 : (e1<e2) ? -1 : 0).forEach(System.out::println);;
		
		EmployeeService employee = new EmployeeService();
		
		employee.getAllEmployees().stream().sorted(
			    Comparator.comparing(Employee::getEmpExperiance)
			              .thenComparing(Employee::getEmpSalary)
			).forEach(System.out::println);
		System.out.println();
		employee.getAllEmployees().forEach(System.out::println);


		List<String> set = new LinkedList<>();
		set.add("10");
		set.add("30");
		set.add("0");
		set.add("20");
		set.add("50");
		set.add("90");
		System.out.println(set);
		
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(100, "Sai");
		map.put(800, "Dog");
		map.put(500, "Yml");
		map.put(300, "Apple");
		
	
		
		System.out.println(map);
		
		LinkedHashMap<Integer, String> collectKey = map.entrySet().stream()
		        .sorted(Map.Entry.comparingByKey())
		        .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (e1, e2) -> e1,
		                LinkedHashMap::new 
		        ));
		
		System.out.println(collectKey);
		
		LinkedHashMap<Integer, String> collectValue = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new 
        ));
		
		System.out.println(collectValue);
	}
	
	
}