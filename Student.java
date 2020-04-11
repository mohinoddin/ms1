package com.jsp.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String regNo;
	private String name;
	private String department;
	
	
	Student()
	{
		
	}
	public Student(String regNo, String name, String department) {


		this.regNo = regNo;
		this.name = name;
		this.department = department;
		
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
