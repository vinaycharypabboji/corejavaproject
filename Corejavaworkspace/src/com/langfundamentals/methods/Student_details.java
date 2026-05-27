package com.langfundamentals.methods;
import java.util.Scanner;
public class Student_details {
	
	static void std_name(String sname) {
		System.out.println("Student Name is : " + sname);
	}
	static void std_roll(int sroll) {
		System.out.println("Student Roll No is : " + sroll);
	}
	static void std_age(int age) {
		System.out.println("Student Age is : " + age);
	}
	static void std_phone(long Phone) {
		System.out.println("Student Phone No is : " + Phone);
	}
	static void std_height(float height) {
		System.out.println("Student Height is : " + height);
	}
	static void std_weight(float weight) {
		System.out.println("Student weight is : " + weight);
	}
	static void std_adhaar(long adhaar) {
		System.out.println("Student Adhaar No is : " + adhaar);
	}
	static void std_pan(String pan) {
		System.out.println("Student PAN No is : " + pan);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String sname = sc.nextLine();
		
		System.out.println("Enter Student Rollno: ");
		int std_no = sc.nextInt();
		 
		System.out.println("Enter Student age :");
		int s_age= sc.nextInt();
		
		System.out.println("Enter Student Phone : ");
		long s_phone = sc.nextLong();
		
		System.out.println("Enter Student Height : ");
		float s_height = sc.nextFloat();
		
		System.out.println("Enter Student Weight : ");
		float s_weight = sc.nextFloat();
		
		System.out.println("Enter Student Adhaar No : ");
		long s_adhaar = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter Student PAN No :");
		String s_pan = sc.nextLine();
		sc.close();
		std_name(sname);
		std_roll(std_no);
		std_age(s_age);
		std_phone(s_phone);
		std_height(s_height);
		std_weight(s_weight);
		std_adhaar(s_adhaar);
		std_pan(s_pan);
		
		
		
	}

}
