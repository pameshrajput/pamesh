package com.firstjson.Test;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



import com.firstjson.json.EmployeeDetail;
import com.firstjson.jsonutil.jsonUtil;

public class Test {

	public static void main(String[] args) {
		Scanner Employee_id = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		Scanner tech = new Scanner(System.in);
		Scanner manager = new Scanner(System.in);

		
		System.out.print("Employee Id here: ");
		int EmpId = Employee_id.nextInt();              //emp_id
		
		System.out.print("Employee name here: ");		
		String Name = name.nextLine();
		
		System.out.print("Employee age here: ");		
		int Age =  age.nextInt();
		
		System.out.print("Employee tech here: ");		
		String Technology = tech.nextLine();
		
		System.out.print("Employee manager here: ");		
		String Manager = manager.next();
		
		EmployeeDetail emp = new EmployeeDetail();
		
	
		emp.setEmpId(EmpId);
		emp.setName(Name);
	
		emp.setAge(Age);
		emp.setTechnology(Technology);
		emp.setManager(Manager);
		
	//convert java object into json
		   String jsonEmployeeDetail = jsonUtil.ConvertJavaToJson(emp);
		System.out.println("Employee Data in json Format :");
		System.out.println("----------------");
	
		System.out.println(jsonEmployeeDetail);
		System.out.println("----------------");
		
		//connvert json object into java
		 
		    EmployeeDetail emp1 = jsonUtil.ConvertJsonToJava(jsonEmployeeDetail , EmployeeDetail.class);
		    System.out.println("Geting value from json object");
		System.out.println(emp1.getEmpId()+" "+emp1.getName()+" "+emp1.getAge()+" "+emp1.getTechnology()+" "+emp1.getManager());
	}

}
