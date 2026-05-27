package com.langfundamentals.methods;
import java.util.Scanner;

 

public class Testdemo10 {
	static double principle;
	static double rate;
	static double time;
	static double calculate_SI(double principle,double rate,double time){
		double SI = ((principle*rate*time)/100);
		return SI;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		double p = sc.nextDouble();
		
		System.out.println("Enter  Rate of interest:");
		double r = sc.nextDouble();
		
		System.out.println("Enter Timet:");
		double t = sc.nextDouble();
		
		
		 double SI = calculate_SI(p,r,t);
		 System.out.println("Simple Interest is:" + (SI));
	}

}
