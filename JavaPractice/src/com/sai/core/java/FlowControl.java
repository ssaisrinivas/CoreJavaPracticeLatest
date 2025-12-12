package com.sai.core.java;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import com.sai.corejava.Employee;
import com.sai.corejava.EmployeeService;

public class FlowControl {

	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();

		// if-else

		List<Employee> allEmployees = es.getAllEmployees();

		List<Employee> empList = allEmployees.stream().filter(e -> e.getEmpExperiance() > 6).toList();

		if (empList != null) {

			// empList.stream().forEach(System.out::println);
		}

		for (Employee employee : allEmployees) {

			if (employee.getEmpSalary() < 50000.00) {

				// System.out.println("Employee Salary less than 50000 " + " EmployeeId : " +
				// employee.getEmpId()
				// + " EmployeeSalary : " + employee.getEmpSalary());
			}

			else {

				// System.out.println("Employee Salary greater than 50000 " + " EmployeeId : " +
				// employee.getEmpId()
				// + " EmployeeSalary : " + employee.getEmpSalary());
			}
		}

		// sort employees on location and salary and experience

		// (e1, e2) -> e1.getEmpLocation().compareTo(e2.getEmpLocation())

		List<Employee> listloc = allEmployees.stream().sorted(Comparator.comparing(Employee::getEmpLocation).reversed())
				.collect(Collectors.toList());
		/*
		 * listloc.stream().forEach( e -> System.out.println("Employee Name : " +
		 * e.getEmpName() + " Location : " + e.getEmpLocation()));
		 */
		System.out.println();

		List<Employee> listexp = allEmployees.stream()
				.sorted((e1, e2) -> e1.getEmpExperiance() > (e2.getEmpExperiance()) ? +1
						: e1.getEmpExperiance() < (e2.getEmpExperiance()) ? -1 : 0)
				.collect(Collectors.toList());
		/*
		 * listexp.stream().forEach( e -> System.out.println("Employee Name : " +
		 * e.getEmpName() + " Experiance : " + e.getEmpExperiance()));
		 * System.out.println();
		 */

		List<Employee> listsal = allEmployees.stream()
				.sorted((e1, e2) -> e1.getEmpDesignation().compareTo(e2.getEmpDesignation()))
				.collect(Collectors.toList());

		/*
		 * listsal.stream().forEach( e -> System.out.println("Employee Name : " +
		 * e.getEmpName() + " Salary : " + e.getEmpDesignation()));
		 */

		/*
		 * for (Employee employee : listsal) {
		 * 
		 * 
		 * 
		 * String city= employee.getEmpLocation();
		 * 
		 * switch(city) {
		 * 
		 * case "Hyderabad": System.out.println("Employee Name is :" +
		 * employee.getEmpName() + " Employee Location is " +
		 * employee.getEmpLocation()); System.out.println(); break;
		 * 
		 * case "Chennai": System.out.println("Employee Name is :" +
		 * employee.getEmpName() + " Employee Location is " +
		 * employee.getEmpLocation()); System.out.println(); break;
		 * 
		 * case "Banglore": System.out.println("Employee Name is :" +
		 * employee.getEmpName() + " Employee Location is " +
		 * employee.getEmpLocation()); System.out.println(); break;
		 * 
		 * case "Mumbai": System.out.println("Employee Name is :" +
		 * employee.getEmpName() + " Employee Location is " +
		 * employee.getEmpLocation()); System.out.println(); break;
		 * 
		 * default : System.out.println("Not Selected any Employee!!");
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * for (Employee employee : allEmployees) {
		 * 
		 * if (employee.getEmpSalary() > 50000.00) {
		 * 
		 * while (employee != null) {
		 * 
		 * System.out.println(employee); employee=null; }
		 * 
		 * } }
		 */
		
		/*
		 * for(int i=0 ; i< 10; i++) {
		 * 
		 * if(i==6) { continue; }
		 * 
		 * System.out.println("Loop iteration : " + i); }
		 */
		
		/*
		 * String dayOfWeek = "Sunday";
		 * 
		 * String activity = switch (dayOfWeek) { case "Monday", "Tuesday", "Wednesday",
		 * "Thursday", "Friday" -> { System.out.println("It's a weekday."); yield
		 * "Work"; // Yields "Work" for weekdays } case "Saturday", "Sunday" -> {
		 * System.out.println("It's the weekend!"); yield "Relax"; // Yields "Relax" for
		 * weekends } default -> "Unknown"; };
		 * 
		 * System.out.println("Today's activity: " + activity);
		 */
		
		
		
		System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE); 
		System.out.println(Short.MIN_VALUE+"---->"+Short.MAX_VALUE);
		
		System.out.println(Integer.reverse(100));
		
		Executor execute = Executors.newFixedThreadPool(2);
	}
	

}
