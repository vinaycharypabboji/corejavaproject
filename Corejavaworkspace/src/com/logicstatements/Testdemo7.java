package com.logicstatements;

import java.util.Scanner;

public class Testdemo7 {
	static int price;
	static int bill;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Pizza - 250rs /n 2.Burger - 120rs /n 3.Snadwich - 100rs /n 4.Coffee - 80rs");
	System.out.println("place your Order :");
	int item = sc.nextInt();
	System.out.println("Enter quantity: ");
	int quantity = sc.nextInt();
	
	switch(item){
	case 1 ->{
		price = 250;
		bill = price*quantity;
		System.out.println("Item - pizza");
		System.out.println("Price = " + price);
		System.out.println("total price = "+ bill);
	}
	case 2 ->{
		price = 120;
		bill = price*quantity;
		System.out.println("Item - Burger");
		System.out.println("Price = " + price);
		System.out.println("total price = "+ bill);
	}
	case 3 ->{
		price = 100;
		bill = price*quantity;
		System.out.println("Item - Sandwich");
		System.out.println("Price = " + price);
		System.out.println("total price = "+ bill);
	}
	case 4 ->{
		price = 80;
		bill = price*quantity;
		System.out.println("Item - Coffe");
		System.out.println("Price = " + price);
		System.out.println("total price = "+ bill);
	}
	default->{
		System.out.println("unkown value entered");
	}
	}

	}

}
