package com.langfundamentals.constructors;

public class Truck {
	String t_brand;
	double t_price;
	
	Truck(String t_brand,double t_price){
		this.t_brand = t_brand;
		this.t_price = t_price;
	}
	
	void info(){
		System.out.println("Truck Brand is:" + t_brand);
		System.out.println("Truck Price is:" + t_price);
	}

	public static void main(String[] args) {
		
		Truck t = new Truck("BharatBenz",8000000);
		
		t.info();
	}

}
