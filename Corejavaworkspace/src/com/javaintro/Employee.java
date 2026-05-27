package com.javaintro;


public class Employee {
	static int orgID = 112233;
	static String orgName = "Vcube";
	
	int eId;
	String eName;

	void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Employee Information");
		emp.eId = 101;
		emp.eName = "Revi";
		System.out.println("Organization ID:" + orgID);
		System.out.println("Organization Name:" + orgName);
		System.out.println("Employee ID:" + emp.eId);
		System.out.println("Employee Name:" + emp.eName);
		crazy();
		display();
	}
	
		
	public void crazy() {	
		Employee emp = new Employee();
		emp.eId = 102;
		emp.eName = "Annasab";
		System.out.println("Organization ID:" + orgID);
		System.out.println("Organization Name:" + orgName);
		System.out.println("Employee ID:" + emp.eId);
		System.out.println("Employee Name:" + emp.eName);
	}
		
	void display() {
		Employee emp = new Employee();
		emp.eId = 103;
		emp.eName = "Vinay";
		System.out.println("Organization ID:" + orgID);
		System.out.println("Organization Name:" + orgName);
		System.out.println("Employee ID:" + emp.eId);
		System.out.println("Employee Name:" + emp.eName);
	}

}
