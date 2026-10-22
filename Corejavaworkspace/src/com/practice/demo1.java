package com.practice;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		char choice;
		boolean valid = true;
		do {
			System.out.println("Enter value 1:");
			int a = sc.nextInt();
			System.out.println("Enter value 2:");
			int b = sc.nextInt();
			System.out.println("Select operation");
			char O = sc.next().charAt(0);
			switch (O) {
			case '+':
				res = a + b;
				System.out.println("sum is" + res);
				break;
			case '-':
				res = a - b;
				System.out.println("diff is " + res);
				break;
			case '*':
				res = a * b;
				System.out.println("product is " + res);
				break;
			case '/':
				if (b != 0) {
					res = a / b;
					System.out.println("quetient is" + res);
				} else {
					System.out.println("Error : division by zero");
					valid = false;
				}
				break;
			case '%':
				res = a % b;
				System.out.println("remainder is" + res);
				break;
			default:
				System.out.println("invalid operator entered");
				valid = false;
				break;
			}
			if (valid) {
				System.out.println(res);
			}
			System.out.println("Do you want to continue? (y/n)");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		
		System.out.println("Calculator Exited");
		sc.close();

	}

}
