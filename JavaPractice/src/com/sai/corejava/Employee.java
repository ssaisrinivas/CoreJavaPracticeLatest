package com.sai.corejava;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {

	int empId;
	String empName;
	transient Double empSalary;
	String empDesignation;
	List<Project> projects;
	String empLocation;
	int empExperiance;

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public int getEmpExperiance() {
		return empExperiance;
	}

	public void setEmpExperiance(int empExperiance) {
		this.empExperiance = empExperiance;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, Double empSalary, String empDesignation, List<Project> projects,
			String empLocation, int empExperiance) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.projects = projects;
		this.empLocation = empLocation;
		this.empExperiance = empExperiance;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation + ", projects=" + projects + ", empLocation=" + empLocation + ", empExperiance="
				+ empExperiance + "]";
	}

}
