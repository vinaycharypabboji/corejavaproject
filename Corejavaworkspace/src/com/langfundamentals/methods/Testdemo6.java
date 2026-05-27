package com.langfundamentals.methods;

public class Testdemo6 {
	static int a=5;
	static int b=2;
	
	int addition() {
		int sum = a+b;
		return sum;
		
	}
	int subtraction() {
		int sub = a-b;
		return sub;
	}
	int multiplication() {
		int mul = a*b;
		return mul;
	}
	float division() {
		float div = a/b;
		return div;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Testdemo6 t = new Testdemo6();
		System.out.println("Addition of two numbers:" + t.addition());
		System.out.println("Subtraction of two numbers:" + t.subtraction());
		System.out.println("Multiplication of two numbers:" + t.multiplication());
		System.out.println("Division of two numbers:" + t.division());
		

	}

}
