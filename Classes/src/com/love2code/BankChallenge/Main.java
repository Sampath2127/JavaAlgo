package com.love2code.BankChallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc0=new BankAccount("xx23556656xxx", 100000, "Bha", "bha@123.com", "123654789");
		BankAccount acc1=new BankAccount();
		acc1.setAccNo("xxxx12335544558");
		//acc1.setBalance(50000);
		acc1.setCustomerName("Sam");
		acc1.setEmail("sam@123.com");
		acc1.setPhoneNumber("123456789");
		acc1.addBalance(6000);
		acc1.withdrawBalance(6001);
		System.out.println(acc1);
		acc0.withdrawBalance(1000);
		System.out.println(acc0);
	}

}
