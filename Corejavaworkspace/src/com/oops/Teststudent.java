package com.oops;

public class Teststudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setstno(101);
		s1.setstname("Spider-Man");
		s1.setstage(27);
		
		System.out.println(s1.getstno());
		System.out.println(s1.getstname());
		System.out.println(s1.getstage());
		System.out.println("******************************");
		s1.setstno(102);
		s1.setstname("Thor");
		s1.setstage(35);
		
		System.out.println(s1.getstno());
		System.out.println(s1.getstname());
		System.out.println(s1.getstage());
		System.out.println("******************************");
		s1.setstno(103);
		s1.setstname("Iron-Man");
		s1.setstage(45);
		
		System.out.println(s1.getstno());
		System.out.println(s1.getstname());
		System.out.println(s1.getstage());
		System.out.println("******************************");
		s1.setstno(104);
		s1.setstname("Hulk");
		s1.setstage(40);
		
		System.out.println(s1.getstno());
		System.out.println(s1.getstname());
		System.out.println(s1.getstage());
	}

}
