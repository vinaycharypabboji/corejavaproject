package com.langfundamentals.constructors;

public class Metal {
	
	String m_name;
	double m_price;
	
	Metal(String m_name,double m_price){
		this.m_name = m_name;
		this.m_price = m_price;
		
	}
	
	void metal_Info(){
		System.out.println("Type of Metal:" + m_name);
		System.out.println("Metal Price:" + m_price);
	}

	public static void main(String[] args) {
		Metal m = new Metal("Gold",154000);
		
		m.metal_Info();

	}

}
