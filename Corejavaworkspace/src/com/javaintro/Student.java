package com.javaintro;

public class Student {
	static int clg_code=501;
	static String clg_name="MRCE";
	
	int std_id;
	String std_name;
	
	public static void main(String args[]) {
		System.out.println("******Student Info******");
		Student std1 = new Student();
		std1.std_id=501;
		std1.std_name="vinay";
		System.out.println("College Code: "+ clg_code);
		System.out.println("College Name: "+ clg_name);
		System.out.println("Student Id: "+ std1.std_id);
		System.out.println("Student Name: "+ std1.std_name);
		System.out.println("------------------------------------");
		Student std2 = new Student();
		std2.std_id=502;
		std2.std_name="Likki";
		System.out.println("College Code: "+ clg_code);
		System.out.println("College Name: "+ clg_name);
		System.out.println("Student Id: "+ std2.std_id);
		System.out.println("Student Name: "+ std2.std_name);
		System.out.println("------------------------------------");
		Student std3 = new Student();
		std3.std_id=503;
		std3.std_name="vikky";
		System.out.println("College Code: "+ clg_code);
		System.out.println("College Name: "+ clg_name);
		System.out.println("Student Id: "+ std3.std_id);
		System.out.println("Student Name: "+ std3.std_name);
		System.out.println("------------------------------------");

	}
}
