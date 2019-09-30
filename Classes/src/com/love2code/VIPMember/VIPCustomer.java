package com.love2code.VIPMember;

public class VIPCustomer {

	private String name;
	private double creditLimit;
	private String email;
	
	public VIPCustomer() {
		this("Sam", 10000000);
	}
	public VIPCustomer(String name, double creditLimit, String email) {
		this.name=name;
		this.creditLimit=creditLimit;
		this.email=email;
		System.out.println("name :"+name+" creditLimit :"+creditLimit+" Email :"+email)	;
	}
	
	public VIPCustomer(String name, double creditLimit){
		this(name, creditLimit, "defaultTwoArg@123.com");
		
	}
}
