package com.oops;

class Employee {

	double calculateSalary(){
		return 0;
	}
	
}

class Developer extends Employee{
	@Override
	double calculateSalary() {
		
		double base_salary = 50000;
		double bonus_salary= 10000;
		return base_salary + bonus_salary;
	}
	
}

class Tester extends Employee{
	@Override
	double calculateSalary() {
		double base_salary = 30000;
		double testing_allowance = 5000;
		
		return base_salary + testing_allowance;
		
	}
}

class Manager extends Employee{
	@Override
	double calculateSalary() {
		double base_salary = 25000;
		double management_bonus = 7000;
		
		return base_salary + management_bonus;
		
	}
}

public class Employee1{
	public static void main(String args[]) {
		Developer d = new Developer();
		Tester t = new Tester();
		Manager m = new Manager();
		
		System.out.println("Developer Salary: " + d.calculateSalary());
		System.out.println("Tester Salary: " + t.calculateSalary());
		System.out.println("Manager Salary: " + m.calculateSalary());
	}
}
