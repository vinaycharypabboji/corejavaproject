package com.langfundamentals;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Testdemo3 {
	BigInteger x= new BigInteger("156342663874763587545476475743653");
	BigInteger y= new BigInteger("15634266387476358754545764375683");
	BigDecimal p= new BigDecimal("6354256746726376456.876572687568");
	BigDecimal q= new BigDecimal("248764763258424.897438895386753");

	public static void main(String[] args) {
		Testdemo3 a = new Testdemo3();
		System.out.println("**********BigInteger************");
		System.out.println(a.x.add(a.y));
		System.out.println(a.x.multiply(a.y));
		System.out.println(a.x.subtract(a.y));
		System.out.println(a.x.divide(a.y));
		System.out.println(a.x.mod(a.y));
		
		System.out.println("**********BigDecimal************");
		System.out.println(a.p.divide(a.q,5,RoundingMode.HALF_UP));

	}

}
