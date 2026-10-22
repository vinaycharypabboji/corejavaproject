package com.logicstatements;

import java.util.Scanner;

public class Testdemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Char:");
		char letter = sc.next().charAt(0);
		
		if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println(letter +" is a vowel");
		}
		else {
			System.out.println(letter + "is not a vowel");
		}

		
	}
}
