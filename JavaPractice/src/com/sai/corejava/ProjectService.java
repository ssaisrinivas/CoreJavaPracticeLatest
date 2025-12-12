package com.sai.corejava;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectService {

	Project project1 = new Project(1, "CSE project", "Completed");
	Project project2 = new Project(2, "Big Data project", "WIP");
	Project project3 = new Project(3, "Cloud project", "Completed");
	Project project4 = new Project(4, "AI project", "WIP");

	List<Project> projectsList = new ArrayList<Project>();

	public List<Project> saveAllProjects() {

		projectsList.add(project1);
		projectsList.add(project2);
		projectsList.add(project3);
		projectsList.add(project4);
		return projectsList;

	}

	public List<Project> getAllProjects() {
		saveAllProjects();
		return projectsList;

	}

	public Project getProjectByTitle(String projectTitle) {
		saveAllProjects();
		Optional<Project> project = projectsList.stream().filter(p -> p.getProjectTitle().equals(projectTitle))
				.findFirst();

		if (project.isPresent())
			return project.get();

		return null;
	}

	public List<Project> getProjectByTitles(String[] projectTitles) {
		saveAllProjects();
		List<Project> requestedProjects = new ArrayList<Project>();
		Project project;

		for (String projectName : projectTitles) {

			Optional<Project> projects = projectsList.stream().filter(p -> p.getProjectTitle().equals(projectName))
					.findFirst();

			if (projects.isPresent())
				requestedProjects.add(projects.get());
		}

		return requestedProjects;
	}

}
