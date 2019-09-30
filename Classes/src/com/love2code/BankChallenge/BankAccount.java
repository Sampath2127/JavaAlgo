package com.love2code.BankChallenge;

public class BankAccount {

	private String accNo;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount(){
		System.out.println("Default constructor");
	}
	
	public BankAccount(String accNo, double balance, String customerName, String email, String phoneNumber) {
		this.accNo = accNo;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void addBalance(double amount){
		
			this.balance+=amount;
			System.out.println("Succesfully added amount "+amount+" your total balance is "+this.balance);
	}
	
	public void withdrawBalance(double withdrawAmt){
		if(withdrawAmt>this.balance){
			System.out.println("Insufficient funds...Please select a different amount!");
		}else{
			this.balance=this.balance-withdrawAmt;
			System.out.println("Successfully withdrawn "+withdrawAmt+" remaining balance is "+this.balance);
		}
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + ", customerName=" + customerName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
