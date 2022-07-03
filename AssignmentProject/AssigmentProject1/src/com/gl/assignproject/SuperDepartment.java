package com.gl.assignproject;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Date;

public class SuperDepartment {
	public String departmentName;
	public String todaysWork;
	public String workDeadline;
	public String todayAHoliday;
	
	//create a constructor
	/*public SuperDepartment() {
		super();
		}*/
	/*public  SuperDepartment() {
		super();
		this.departmentName=departmentName;
		this.todayWork=todayWork;
		this.workDeadline=workDeadline;
		this.todayAHoliday=todayAHoliday;
	}*/
	//create getter and setter method of super class
	// get method for department name
	public String getDepartmentName() {
		departmentName="Super Department";
		return departmentName;
	}
	/*
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}*/
	//get method for today work
	public String getTodaysWork() {
		todaysWork="No work as for now";
		return todaysWork;
	}
	/*
	public void setTodayWork(String todayWork) {
		this.todaysWork =todayWork;
	}*/
	//get method for work deadline
	public String getWorkDeadline() {
		workDeadline="Nil";
		return workDeadline;
	}/*
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline =workDeadline;
	}*/
	//we create a isTodayAHoliday function  which represent today is holiday or not
	//it take date and day or week day through import classes and tell today is holiday or not 
	public String isTodayAHoliday() {
		//according to day it represent today is not holiday or today is holiday
		SimpleDateFormat s = new SimpleDateFormat("EEEE,dd/MM/yyyy");
		//here we create object of SimpleDateFormat so it represent day and date 
		todayAHoliday= s.format(new Date());
		LocalDate date = LocalDate.now();
		// here it get day and represent Sunday and Saturday is holiday
	      DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
	      switch (day) {
	         case SATURDAY:
	            //System.out.println(" Today is Saturday");
	            System.out.println(" Today is  Holiday");
	            break;
	         case SUNDAY:
	            //System.out.println(" Today is Sunday");
	            System.out.println(" Today is  Holiday");
	            break;
	         default:
	            System.out.println(" Today is Not Holiday");
	      }
	      return "Today is: "+todayAHoliday;
	}
}
	
	
		
		
	/*public void setTodayAHoliday(String todayAHoliday) {
		this.todayAHoliday = todayAHoliday;
	}*/
