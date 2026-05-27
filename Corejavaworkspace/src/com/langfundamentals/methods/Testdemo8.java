package com.langfundamentals.methods;

public class Testdemo8 {
	 int Emp_ID=18;
	 String Emp_name="vinay";
	 int Emp_age=21;
	 long Emp_phone=6476277587L;
	
	static public class objectmethods{
	static Testdemo8 show() {
		Testdemo8 t = new Testdemo8();
		return t;
		
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Testdemo8 s = objectmethods.show();
		System.out.println(s.Emp_ID);
		System.out.println(s.Emp_name);
		System.out.println(s.Emp_age);
		System.out.println(s.Emp_phone);
		

	}

}
