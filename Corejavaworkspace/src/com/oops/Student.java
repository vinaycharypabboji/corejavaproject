package com.oops;

public class Student {

	private int stno;
	private String stname;
	private int stage;
	
	public void setstno(int stno) {
		this.stno = stno;
	}
	
	public int getstno() {
		return stno;
	}
	
	public void setstname(String stname) {
		this.stname = stname;
		
	}
	
	public String getstname() {
		return stname;
	}
	
	public void setstage(int stage) {
		this.stage = stage;
		
	}
	
	public int getstage() {
		return stage;
	}
}
