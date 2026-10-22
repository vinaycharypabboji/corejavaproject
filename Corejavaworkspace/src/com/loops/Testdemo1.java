package com.loops;

import java.util.Scanner;

public class Testdemo1 {
	
	static boolean status = isPerfect(int a){
		status = false;
		return status;
		
		for(int i=1;i<=a/2;i++) {
			int sum = 0;
			if(a%i==0) {
				
				sum = sum+i;
			}
			System.out.println(sum);
		}
		status =true;
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a values:");
		int a = sc.nextInt();
		
		
	}

}
