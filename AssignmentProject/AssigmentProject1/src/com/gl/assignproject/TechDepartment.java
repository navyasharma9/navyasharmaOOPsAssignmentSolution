package com.gl.assignproject;
//import java.text.SimpleDateFormat;
public class TechDepartment extends SuperDepartment {
	//String departmentName;
	//String todayWork;
	//String workDeadline;
	//String todayAHoliday;
	private String techStackInformation;
	//here we create get method for department name
	public String getDepartmentName() {
		departmentName="Tech Department";
		return departmentName;
	}
	/*
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}*/
	//here we create get method of todays work
	public String getTodaysWork() {
		todaysWork="Complete coding Module 1";
		return todaysWork;
	}
	/*
	public void setTodayWork(String todayWork) {
		this.todaysWork = todaysWork;
	}*/
	//here we create get method for work deadline
	public String getWorkDeadline() {
		workDeadline="Complete by EOD";
		return workDeadline;
	}
	/*
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}*/
	//here we create get method for tech stack information
	public String getTechStackInformation() {
		techStackInformation="Core Java";
		return techStackInformation;
	}
	/*public void setTechStackInformation(String techStackInformation) {
		this.techStackInformation = techStackInformation;
	}*/
	
}
