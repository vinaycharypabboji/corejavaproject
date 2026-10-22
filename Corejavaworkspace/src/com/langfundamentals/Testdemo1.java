package com.langfundamentals;

public class Testdemo1 {
	static int acc_no=100;
	String name;
	float balance;
	{
		acc_no++;
	}
	void display() {
		System.out.println("Account No: "+ acc_no);
		System.out.println("Name: "+ name);
		System.out.println("Balance: "+ balance);
	}

	public static void main(String[] args) {
		Testdemo1 b1 = new Testdemo1();
		b1.name="Vinay";
		b1.balance=2578.95f;
		b1.display();
		System.out.println("------------------------------");
		Testdemo1 b2 = new Testdemo1();
		b2.name="likki";
		b2.balance=1563.75f;
		b2.display();
		System.out.println("------------------------------");
	
	}

}
