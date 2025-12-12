package com.sai.corejava;

import java.io.Serializable;

public class Project   implements Serializable{
	
	int prijectId;
	String projectTitle;
	String projectStatus;
	
	public int getPrijectId() {
		return prijectId;
	}
	public void setPrijectId(int prijectId) {
		this.prijectId = prijectId;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [prijectId=" + prijectId + ", projectTitle=" + projectTitle + ", projectStatus="
				+ projectStatus + "]";
	}
	public Project(int prijectId, String projectTitle, String projectStatus) {
		super();
		this.prijectId = prijectId;
		this.projectTitle = projectTitle;
		this.projectStatus = projectStatus;
	}
	
	

}
