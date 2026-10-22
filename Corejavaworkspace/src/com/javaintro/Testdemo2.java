package com.javaintro;

public class Testdemo2 {
	static Testdemo2 t = new Testdemo2();
	static String Orgname = "Vcube";
	static int Orgid = 5043;
	String Ename;
	int Eid;

	public static void main(String[] args) {
		System.out.println("********Employee Info********");
		t.Ename = "Vinay";
		t.Eid = 21;
		System.out.println("Organization Name:" + Orgname);
		System.out.println("Organization ID:" + Orgid);
		System.out.println("Employee Name:" + t.Ename);
		System.out.println("Employee Name:" + t.Eid);
		System.out.println("********Employee Info********");
		t.Ename = "likki";
		t.Eid = 20;
		System.out.println("Organization Name:" + Orgname);
		System.out.println("Organization ID:" + Orgid);
		System.out.println("Employee Name:" + t.Ename);
		System.out.println("Employee Name:" + t.Eid);
		
		
	}
}
