package com.oops;

class Child implements Cloneable{
	int sid;
	String sname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {	
		return super.clone();
	}
		
	public Child(int sid, String sname, Address city) {
		this.sid = sid;
		this.sname = sname;
		this.address = city;	

	}
}

	 class Address{
		String city;

		public Address(String city) {
			this.city=city;
		}
		@Override
		public String toString() {	
			return city;
		}
	}


public class Testdemo1{
	public static void main(String[]args) throws Exception{
		Address add = new Address("HYD");
		Child s1 = new Child(101,"vinay",add);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address);
	
		Child s2 = (Child)s1.clone();
		
		s2.address.city="banglore";
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address);
		

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address);
	
	
}
}
