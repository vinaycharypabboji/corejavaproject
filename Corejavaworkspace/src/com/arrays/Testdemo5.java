package com.arrays;

import java.util.Scanner;

public class Testdemo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int size = sc.nextInt();
		int roll[] = new int[size];
		
		for(int i=0;i<roll.length;i++) {
			roll[i] = sc.nextInt();
		}
		for(int i=0;i<roll.length;i++) {
			System.out.println(roll[i]);
		}
		for(int i=0;i<roll.length;i++) {
			if(isPrime(roll[i])) {
				System.out.println(roll[i] + " ");
			}
		}
		
	}
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}
	
}
