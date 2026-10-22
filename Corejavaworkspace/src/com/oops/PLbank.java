package com.oops;

import java.util.Scanner;

public class PLbank {
	Scanner sc = new Scanner(System.in);

	boolean isPhonevalid() {
		System.out.println("Enter your phone number:");
		String phone = sc.next();
		boolean isPhonevalid = phone.matches("[6-9]{1}[0-9]{9}");
		return isPhonevalid;
	}

	boolean isAadharvalid() {
		System.out.println("Enter your aadhar number:");
		String Aadhar = sc.next();
		boolean isAadharvalid = Aadhar.matches("[0-9]{12}");
		return isAadharvalid;
	}

	boolean isPanvalid() {
		System.out.println("Enter your PAN number:");
		String pan = sc.next();
		boolean isPanvalid = pan.matches("[A-z]{4}[0-9]{5}[A-Z]");
		return isPanvalid;
	}

	double getsalary() {
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	int cibil() {
		System.out.println("Enter your cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	int age() {
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		return age;
	}

	double ROI() {
		return 9.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan Bank");

		PLbank pl = new PLbank();
		double salary = pl.getsalary();
		int cibil = pl.cibil();
		int age = pl.age();

		if ((age > 22 && age <= 60) && salary > 40000 && (cibil > 300 && cibil <= 900) && (pl.isPhonevalid())
				&& (pl.isAadharvalid()) && (pl.isPanvalid())) {
			System.out.println("Congratulations you are eligible for personal loan.");

			double roi = pl.ROI();

			if (cibil > 300 && cibil < 600) {
				System.out.println("Poor score.");
				roi = roi - 3.5;
			} else if (cibil >= 600 && cibil < 700) {
				System.out.println("Fair Score");
				roi = roi + 2.5;
			} else if (cibil >= 700 && cibil <= 750) {
				System.out.println("Good score");
				roi = roi + 1.5;
			} else {
				System.out.println("Excellent Score");
				roi = roi - 1;
			}

			System.out.println("Your rate of Interest is :" + roi);

		} else {
			System.out.println("Sorry:( !! Focus on carrer.");
		}
	}

}
