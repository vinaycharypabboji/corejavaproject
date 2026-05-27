package com.langfundamentals;

public class bank {
	static int acc_no=100;
	String name;
	float balance;
	{
		acc_no++;
	}
	void display(){
		System.out.println("Account No:" + acc_no);
		System.out.println("Name:" + name);
		System.out.println("Balance:" + balance);
	}
	public static void main(String[] args) {
		System.out.println("**********************************");
		bank b1 = new bank();
		b1.name="vinay";
		b1.balance=25250.46f;
		b1.display();
		System.out.println("**********************************");
		bank b2 = new bank();
		b2.name="ravi";
		b2.balance=55000.46f;
		b2.display();
		System.out.println("**********************************");
		bank b3 = new bank();
		b3.name="annasab";
		b3.balance=15750.46f;
		b3.display();
		
		
	}
	

}
