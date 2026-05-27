package com.langfundamentals;

public class langtestdemo1 {
	int i;
	char c;
	byte b;
	short s;
	long l;

	public static void main(String[] args) {
		System.out.println("Main method started");
		langtestdemo1 t = new langtestdemo1();
		System.out.println("Byte value" + t.b);
		System.out.println("Short value" + t.s);
		System.out.println("int value" + t.i);
		System.out.println("long value" + t.l);
		
		System.out.println("char value" + t.c);
		System.out.println("Main method ended");

	}

}
