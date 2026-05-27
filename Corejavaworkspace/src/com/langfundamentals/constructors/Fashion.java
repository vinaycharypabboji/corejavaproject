package com.langfundamentals.constructors;

public class Fashion {
	
	String s_brand;
	double s_price;
	
	Fashion(String s_brand,double s_price){
		this.s_brand = s_brand;
		this.s_price = s_price;
	}
	
	void details() {
		System.out.println("Shirt Brand is:" + s_brand);
		System.out.println("Shirt Price is:" + s_price);
	}
	
	public static void main(String[] args) {
		
		Fashion f = new Fashion("MAX",1200);
		f.details();
		
		

	}

}
