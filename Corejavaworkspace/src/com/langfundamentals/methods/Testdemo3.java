package com.langfundamentals.methods;
import java.util.Scanner;

public class Testdemo3 {
	static Scanner sc = new Scanner(System.in);
	static double balance = 10000;
	void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Total balance is:" + (balance));
	}
	void withdraw(double amount1) {
		balance = balance - amount1;
		System.out.println("Total Bkance is:" + (balance));
	}

	public static void main(String[] args) {
		Testdemo3 t = new Testdemo3();
		System.out.println("Current Balance is:" + (balance));
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the amount you want to deposit:");
		double amount = sc.nextDouble();
		t.deposit(amount);
		System.out.println("Enter amont to be withdrawn:");
		double amount1 = sc.nextDouble();
		t.withdraw(amount1);
	}

}
