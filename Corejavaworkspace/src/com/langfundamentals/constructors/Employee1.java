package com.langfundamentals.constructors;

public class Employee1 {

	int id;
	String name;
	double salary;

	Employee1() {
		this(1, "vinay");
		System.out.println("no arg constructor called");

	}

	Employee1(int id, String name) {
		this(id, name, 123456.00);

		System.out.println("2 arg constructor called");

	}

	Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

		System.out.println("3 arg");

	}

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.Display();

	}

	void Display() {
		System.out.println("Employee ID:" + id);
		System.out.println("Employee name:" + name);
		System.out.println("Salary:" + salary);
	}

}
