package com.sai.corejava;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	public static List<Employee> getAllEmployees() {

		Employee employee = new Employee();

		List<Employee> empList = new ArrayList<Employee>();
		
		ProjectService ps = new ProjectService();

		empList.add(new Employee(500, "Sai", 12000.33, "Devloper",
				ps.getProjectByTitles(new String[] { "CSE project", "Cloud project" }), "Hyderabad", 8));
		
		empList.add(new Employee(800, "Srinivas", 70000.23, "Tester",
				ps.getProjectByTitles(new String[] { "AI project", "Big Data project" }), "Chennai", 5));
		
		empList.add(new Employee(300, "Rambabu", 50000.6, "Sr.Devloper",
				ps.getProjectByTitles(new String[] { "CSE project", "Cloud project", "Big Data project" }), "Banglore",
				7));
		
		empList.add(new Employee(100, "Nagalakshmi", 90000.83, "Manager", ps.getAllProjects(), "Mumbai", 25));

		return empList;

	}

}
