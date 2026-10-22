package com.oops;

public class Bank {

	static long acc_no = 12345678;
	private String name;
	private double balance;
	private double withdraw;
	private double deposit;
	
	{
		acc_no++;
	}
	
	
	public long getAcc_no() {
		return acc_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdraw() {
		if(withdraw <= balance) {
		 balance -= withdraw;
		}
		return balance;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getDeposit() {
		if(deposit > 0) {
		balance += deposit;
		}
		return balance;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	
}
