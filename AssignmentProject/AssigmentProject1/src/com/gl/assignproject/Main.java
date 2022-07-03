package com.gl.assignproject;

public class Main {
	public static void main(String[] args) {
		
		//here we create object of Admin department class
		AdminDepartment admin=new AdminDepartment();
		System.out.println(" Welcome to "+admin.getDepartmentName());
		System.out.println(" "+admin.getTodaysWork());
		System.out.println(" "+admin.getWorkDeadline());
		System.out.println(" "+admin.isTodayAHoliday());
		System.out.println("                     ");
		
		//here we create object of HR department class
		HrDepartment hr= new HrDepartment();
		System.out.println(" Welcome to "+hr.getDepartmentName());
		System.out.println(" "+hr.getDoActivity());
		System.out.println(" "+hr.getTodaysWork());
		System.out.println(" "+hr.getWorkDeadline());
		System.out.println(" "+hr.isTodayAHoliday());
		System.out.println("              ");
		
		//here we create object of tech department
		TechDepartment tech=new TechDepartment();
		System.out.println(" Welcome to "+tech.getDepartmentName());
		System.out.println(" "+tech.getTodaysWork());
		System.out.println(" "+tech.getWorkDeadline());
		System.out.println(" "+tech.getTechStackInformation());
		System.out.println(" "+tech.isTodayAHoliday());
	
	}
}
