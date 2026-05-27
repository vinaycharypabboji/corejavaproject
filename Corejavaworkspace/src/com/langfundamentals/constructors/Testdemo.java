package com.langfundamentals.constructors;

public class Testdemo {
	Testdemo(){
		System.out.println("no arg constructor from tesetdemo");
	}

	public static void main(String[] args) {

	}

}

class Student extends Testdemo {
	Student(){
		
		System.out.println("no arg constructor from Student");
	}
	public static void main(String[] args) {
		
		Testdemo t = new Testdemo();

	}
}