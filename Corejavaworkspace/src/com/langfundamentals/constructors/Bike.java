package com.langfundamentals.constructors;

public class Bike {
	
	String b_brand;
	double b_price;
	Bike(String b_brand,double b_price){
		this.b_brand = b_brand;
		this.b_price = b_price;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Bike b = new Bike("Kawasaki",1400000);
		b.display();
		System.out.println("main methos ended");
	}
	
	void display() {
		System.out.println("Bike Brand is:" + b_brand);
		System.out.println("Bike Price is:" + b_price);
	}

}
