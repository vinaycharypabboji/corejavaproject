package com.operators;

import java.util.Scanner;

public class Testdemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("enter value a = ");
		int a = sc.nextInt();
		
		System.out.println("enter value b = ");
		int b = sc.nextInt();
		
		// ==
		System.out.println("both a and b are equal " + (a == b));
		
		// <=
		System.out.println("a is less than or equal to b " + (a<=b));
		//>=
		System.out.println("a is greater then or equal to b " +(a>=b));
		// !=
		System.out.println("a is not equal to b " +(a!=b));
		
		System.out.println("a is not equal to b " +(!(a==b)));
	}

}
