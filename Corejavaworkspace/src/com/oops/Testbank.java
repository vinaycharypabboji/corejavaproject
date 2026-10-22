package com.oops;

import java.util.Scanner;

public class Testbank {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		Bank t1 = new Bank();
		
		t1.setName("Vinay");
		t1.setBalance(5000);
		System.out.println("Balance amount:" + (t1.getBalance()));
		System.out.println("Enter the amount you want to deposit:");
		t1.setDeposit(sc.nextDouble());
		System.out.println("Enter the amount you want to withdraw:");
		t1.setWithdraw(sc.nextDouble());
		
		System.out.println("Accout number:" + t1.getAcc_no());
		System.out.println("Account Holder name:" + t1.getName());
		System.out.println("Balance amount after deposit" + t1.getDeposit());
		System.out.println("Balance amount after Withdraw" + t1.getWithdraw());
		System.out.println("Final balance:" + t1.getBalance());
		
		
		sc.close();
	}

}
