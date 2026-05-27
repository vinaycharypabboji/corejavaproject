package com.javaintro;

public class Student1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.javaintro.Test1");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ex");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
