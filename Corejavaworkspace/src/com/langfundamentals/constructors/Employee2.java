package com.langfundamentals.constructors;

public class Employee2 {

	int id;
	String name;
	double salary;

	Employee2() {
		this(1, "vijay");
		System.out.println("no arg constructor called");

	}

	Employee2(int id, String name) {
		this(2, "vinay", 123456.00);
		display();
		System.out.println("2 arg constructor called");

	}

	Employee2(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		display();
		System.out.println("3 arg");

	}

	public static void main(String[] args) {
		Employee2 e = new Employee2();
		e.display();

	}

	void display() {
		System.out.println("Employee ID:" + id);
		System.out.println("Employee name:" + name);
		System.out.println("Salary:" + salary);
	}

}
