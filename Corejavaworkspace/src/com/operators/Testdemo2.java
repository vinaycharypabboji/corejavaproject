package com.operators;

import java.util.Scanner;

public class Testdemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value 1");
		int a = sc.nextInt();
		
		System.out.println("enter value 2");
		int b = sc.nextInt();
		
		if((a&1)==0) {
			System.out.println("given value is even");
		}
		else {
			System.out.println("given value is odd");
		}

	}

}
