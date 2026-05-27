package com.javaintro;


public class Testdemo {
	static String Orgname = "Vcube";
	static int Orgid = 5103;
	String eName;
	int eID;
	
	static void method1() {
		String eName = "Annasab";
		int eID = 101;
		System.out.println("Organization Name:" + Orgname);
		System.out.println("Organization ID:" + Orgid);
		System.out.println("Employee Name:" + eName);
		System.out.println("Employee ID:" + eID);
		System.out.println("---------------------------------------");
	}
		
		public static void main(String[] args) {
			method1();
			Testdemo t = new Testdemo();
			t.method2();
			Testdemo emp = new Testdemo();
			emp.eName = "Vinay";
			emp.eID = 104;
			System.out.println("Employee Name:" + emp.eName);
			System.out.println("Employee ID:" + emp.eID);
			System.out.println("Organization Name:" + Orgname);
			System.out.println("Organization ID:" + Orgid);
			System.out.println("---------------------------------------");
	}
		void method2(){
			eName = "Revi";
			eID = 102;
			System.out.println("Organization Name:" + Orgname);
			System.out.println("Organization ID:" + Orgid);
			System.out.println("Employee Name:" + eName);
			System.out.println("Employee ID:" + eID);
			System.out.println("---------------------------------------");
			method1();
			System.out.println("static method1 called");
			method4();
			System.out.println("instance method1 called");
			}
		void method4() {
			eName = "Likhith";
			eID = 103;
			System.out.println("Organization Name:" + Orgname);
			System.out.println("Organization ID:" + Orgid);
			System.out.println("Employee Name:" + eName);
			System.out.println("Employee ID:" + eID);
			System.out.println("---------------------------------------");
		}

}
