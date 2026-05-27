package com.langfundamentals.constructors;

public class Person {
	String name;
	int age;
	long phone;

	Person() {
		this("Ravi", 22);
		System.out.println("no arg constructor called");

	}

	Person(String name, int age) {
		this(name, age, 74774852842L);

	}

	Person(String name, int age, long phone) {

		this.name = name;
		this.age = age;
		this.phone = phone;

	}

	void show() {
		System.out.println("Person name:" + name);
		System.out.println("Person age:" + age);
		System.out.println("Phone No:" + phone);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("annasab", 25);
		p2.show();

		Person p3 = new Person("likki", 21, 74774852842L);
		p3.show();
	}

}
