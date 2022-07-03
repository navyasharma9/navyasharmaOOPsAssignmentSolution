package com.gl.assignproject;
//import java.text.SimpleDateFormat;
public class AdminDepartment extends SuperDepartment {
	//String departmentName;
	//String todayWork;
	//String workDeadline;
	//String todayAHoliday;
	
	//get method for department name
	public String getDepartmentName() {
		departmentName="Admin Department";
		return departmentName;
	}
	/*
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}*/
	//get method for todays work
	public String getTodaysWork() {
		todaysWork="Complete your documents Submission";
		return todaysWork;
	}
	/*
	public void setTodayWork(String todayWork) {
		this.todaysWork = todaysWork;
	}*/
	//get method for work deadline
	public String getWorkDeadline() {
		workDeadline="Complete by EOD";
		return workDeadline;
	}
	/*
	public void setWorkdeadline(String workdeadline) {
		this.workDeadline = workdeadline;
	}*/
	
	
}
