package com.firstjson.json;

import java.io.Serializable;
import java.util.Scanner;

public class EmployeeDetail implements Serializable {
	
Scanner sc = new Scanner(System.in);
    private int EmpId;
	private String Name;
	private int Age;
	private String Technology;
	private String Manager;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
	
		Name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public int getAge() {
		
		return Age;
	}
	public void setAge(int age) {

		Age = age;
	}
	public String getTechnology() {
		return Technology;
	}
	public void setTechnology(String technology) {
		
		Technology = technology;
	}
	public String getManager() {
	
		return Manager;
	}
	public void setManager(String manager) {
		
		Manager = manager;
	}

	
	
	

	
}
