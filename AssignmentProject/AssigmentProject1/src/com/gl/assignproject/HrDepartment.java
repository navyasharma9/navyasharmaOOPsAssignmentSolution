package com.gl.assignproject;
public class HrDepartment extends SuperDepartment {
	//String departmentName;
	//String todayWork;
	//String workDeadline;
	private String doActivity;
	//get method for department name 
	public String getDepartmentName() {
		departmentName="HR Department";
		return departmentName;
	}
	/*
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}*/
	//get method for todays work
	public String getTodaysWork() {
		todaysWork="Fill today's timesheet and mark your attendance";
		return todaysWork;
	}
	/*
	public void setTodayWork(String todayWork, String todaysWork) {
		this.todaysWork = todaysWork;
	}*/
	// get method for work deadline
	public String getWorkDeadline() {
		workDeadline="Complete by EOD";
		return workDeadline;
	}
	/*
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}*/
	//get method for do activity
	public String getDoActivity() {
		doActivity="Team Lunch";
		return doActivity;
	}
	/*
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}*/
	
}
