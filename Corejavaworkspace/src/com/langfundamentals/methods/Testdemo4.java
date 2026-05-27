package com.langfundamentals.methods;
import java.util.Scanner;
public class Testdemo4 {
	static Scanner sc = new Scanner(System.in);
	double salary() {
		System.out.println("Enter Your Salary");
		double sal = sc.nextDouble();
		return sal;
	}
	
	double bonus() {
		System.out.println("Enter your bonus:");
		double bon = sc.nextDouble();
		return bon;
	}
	public static void main(String[] args) {
		Testdemo4 t = new Testdemo4();
		double Basic_sal = t.salary();
		double Bonus_sal = t.bonus();
		System.out.println("Total salary is :" + (Basic_sal + Bonus_sal));
		
		
		
		
		

	}

}
