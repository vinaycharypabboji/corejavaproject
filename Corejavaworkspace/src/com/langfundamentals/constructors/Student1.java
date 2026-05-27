package com.langfundamentals.constructors;

public class Student1 {
	String name;
	int roll;
	String batch;
	long phone;
	Student1(){
		
	}
	
	Student1(String name,int roll,String batch){
		this.name = name;
		this.roll = roll;
		this.batch = batch;
		
		
	}
	Student1(Student1 s2,long phone){
		this.name = s2.name;
		this.roll = s2.roll;
		this.batch = s2.batch;
		this.phone = s2.phone;
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.show();
		Student1 s2 = new Student1("vinay",18,"CSE");
		s2.show();
		Student1 s3 = new Student1(s2,9988776655L);
	}
	void show() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(batch);
		
	}

}
