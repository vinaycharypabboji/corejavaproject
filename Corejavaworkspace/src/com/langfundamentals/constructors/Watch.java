package com.langfundamentals.constructors;

public class Watch {
	String w_brand;
	double w_price;
	
	Watch(String w_brand,double w_price){
		this.w_brand = w_brand;
		this.w_price = w_price;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Watch w = new Watch("Fossil",15000);
		w.display();
		System.out.println("main method ended");
	}
	void display() {
		System.out.println("Watch Brand is:" + w_brand);
		System.out.println("Watch Price is:" +w_price);
	}
}
