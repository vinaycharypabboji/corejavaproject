package com.langfundamentals.methods;
import java.util.Scanner;

public class Testdemo5 {
	static Scanner sc = new Scanner(System.in);
	
	
	void addition(double a,double b) {
		double sum = a+b;
		System.out.println("Sum of two numbers is:" + (sum));
		
	}
	void subtraction(double a,double b) {
		double sub = a-b;
		System.out.println("Diff of two numbers is:" + (sub));
		
	}
	void multiplication(double a,double b) {
		double mul = a*b;
		System.out.println("Mul of two numbers is:" + (mul));
		
	}
	void division(double a,double b) {
		double div = a/b;
		System.out.println("Div of two numbers is:" + (div));
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter num1");
		double num1 = sc.nextDouble();
		System.out.println("Enter num2");
		double num2 = sc.nextDouble();
		
		Testdemo5 t = new Testdemo5();
		
		t.addition(num1,num2);
		t.subtraction(num1, num2);
		t.multiplication(num1, num2);
		t.division(num1, num2);

	}

}
