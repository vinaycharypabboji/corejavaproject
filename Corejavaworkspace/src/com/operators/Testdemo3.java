package com.operators;

import java.util.Scanner;

public class Testdemo3 {

	public static void main(String[] args) {
		int a=4;
		int b=6;
		int c=8;
		
		int max = (a>b)?
				(a>c)?a:c
						:((b>c)?b:c);
		System.out.println("max value is :" + (max));
		
		Scanner sc = new Scanner(System.in);
		
		String p = "even";
		String q = "odd";
		
		System.out.println("Enter value 1:");
		int x = sc.nextInt();
		
		String str = (x%2==0)?p:q;
		
		System.out.println("value is " + str);
		
		
		
		

	}

}
