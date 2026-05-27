package com.langfundamentals.constructors;

public class Mobile1 {
	String brand;
	String model;
	double price;

	Mobile1(){
		System.out.println("parent constructor");
	}
	Mobile1(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	public static void main(String[] args) {
		Mobile1 m = new Mobile1("IPHONE","17PRO",125000.00);
		System.out.println("Brand :" + m.brand);
		System.out.println("Model :" + m.model);
		System.out.println("Price :" + m.price);
		
		
Oneplus op = new Oneplus("OnePlus","11R",40000.00);
		
		System.out.println("Brand :" + op.brand);
		System.out.println("Model :" + op.model);
		System.out.println("Price :" + op.price);
		
	}

}
class Oneplus extends Mobile1{
	Oneplus(){
		
		System.out.println("no arg constructor called");
	}
	Oneplus(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	
	
	public static void main(String[] args) {
		Oneplus op = new Oneplus("OnePlus","11R",40000.00);
		
		System.out.println("Brand :" + op.brand);
		System.out.println("Model :" + op.model);
		System.out.println("Price :" + op.price);
	}
}
