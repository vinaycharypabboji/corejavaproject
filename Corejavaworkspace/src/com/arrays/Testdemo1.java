package com.arrays;

public class Testdemo1 {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "vinay";
		names[1] = "likki";
		names[2] = "annasab";
		names[3] = "ravi";
		names[4] = "vikky";
		
		System.out.println("************* for loop ****************");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		System.out.println("************for each ********************");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("***************************************");
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("y")) {
				System.out.println(names[i]);
			}
		}
		System.out.println("*******************************");
		for(String name:names) {
			if(name.contains("a")) {
				System.out.println(name);
			}
		}
	}

}
