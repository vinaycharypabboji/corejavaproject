package com.langfundamentals.methods;

public class Testdemo9 {
	static void emp_details() {
		Testdemo8 s1 = Testdemo8.objectmethods.show();
		System.out.println(s1.Emp_ID);
		System.out.println(s1.Emp_name);
		System.out.println(s1.Emp_age);
		System.out.println(s1.Emp_phone);
	}

	public static void main(String[] args) {
		
		emp_details();
	}

}
