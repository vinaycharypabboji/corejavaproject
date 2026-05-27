package com.langfundamentals.methods;
import java.util.Scanner;
public class Calculate {
	static void display() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String Std_name = sc.nextLine();
		
		System.out.println("Enter Student Rollno:");
		int Std_roll = sc.nextInt();
		
		System.out.println("Enter Student Phone:");
		Long Std_phone = sc.nextLong();
		
		
		System.out.println("Enter Sub1 Marks:");
		int sub1_marks = sc.nextInt();
		
		System.out.println("Enter Sub2 Marks:");
		int sub2_marks = sc.nextInt();
		
		System.out.println("Enter Sub3 Marks:");
		int sub3_marks = sc.nextInt();
		
		System.out.println("Student Name is:" + Std_name);
		System.out.println("Student Roll No is:" + Std_roll);
		System.out.println("Student phone No is:" + Std_phone);
		
		total(sub1_marks,sub2_marks,sub3_marks);
		average(sub1_marks,sub2_marks,sub3_marks);
		
		
	}
	static void total(int sub1_marks,int sub2_marks,int sub3_marks){
		System.out.println("Total marks =" + (sub1_marks+sub2_marks+sub3_marks));
		}
	static void average(int sub1_marks,int sub2_marks,int sub3_marks) {
		System.out.println("Average marks =" + (sub1_marks+sub2_marks+sub3_marks)/3);
	}
		
	
	
	public static void main(String[] args) {
		
		display();
			}

}
