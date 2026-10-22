package com.logicstatements;

import java.util.Scanner;

public class Testdemo5 {

	public static void main(String[] args) {
		int fare;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
		if(age < 5){
			fare = 0;
			System.out.println("Free Ticket");
			System.out.println("Fare = " + (fare));
		}
		else if(age > 5 && age <= 12){
			fare = 20;
			System.out.println("Child Ticket");
			System.out.println("Fare = " + (fare)+"rs");
		}
		else if(age > 13 && age <= 59){
			fare = 50;
			System.out.println("Regular Ticket");
			System.out.println("Fare = " + (fare)+"rs");
			
		}
		else if(age > 59 && age <= 100){
			fare = 30;
			System.out.println("Senior citizen Ticket");
			System.out.println("Fare = " + (fare)+"rs");
		}
		else {
			System.out.println("Invalid age entered");
		}
	}

}
