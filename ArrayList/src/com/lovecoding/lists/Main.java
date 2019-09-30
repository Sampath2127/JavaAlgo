package com.lovecoding.lists;

import java.util.Scanner;

public class Main {
	private static Scanner scr=new Scanner(System.in);
	private static MobilePhone mobilePhone=new MobilePhone();
	public static void main(String[] args) {
		String name, phoneNumber;
		boolean quit=false;
		System.out.println("Choose your option");
		displayOptions();
		while(!quit){
			int option=scr.nextInt();
			scr.nextLine();
		switch(option){
		case 1:
			System.out.println("Enter contact name");
			 name=scr.nextLine();
			System.out.println("Enter Phone number");
			 phoneNumber=scr.nextLine();
			addContact(name, phoneNumber);
			break;
		case 2:
			System.out.println("Enter contact name to be modified");
			 name=scr.nextLine();
			System.out.println("Enter Phone number");
			 phoneNumber=scr.nextLine();
			 modifyContact(name, phoneNumber);
			 break;
		case 3:
			System.out.println("Enter the contact name to be removed");
			name=scr.nextLine();
			remove(name);
			break;
		case 4:
			System.out.println("Enter the contactName to search");
			name=scr.nextLine();
			searchContact(name);
			break;
		case 5:
			printContcts();
			break;
		case 6:
			System.out.println("Exiting...!");
			quit=true;
			break;
		}
		displayOptions();
		}
	}
	
	private static void addContact(String contactName, String phoneNumber){
		mobilePhone.store(contactName, phoneNumber);
	}
	private static void modifyContact(String contactName, String phoneNumber){
		mobilePhone.modifyContact(contactName, phoneNumber);
	}
	private static void searchContact(String contactName){
		System.out.println(mobilePhone.search(contactName));
	}
	private static void remove(String contactName){
		mobilePhone.remove(contactName);
	}
	private static void displayOptions() {
		System.out.println("Enter 1 for adding contact");
		System.out.println("Enter 2 for updating contact");
		System.out.println("Enter 3 for deleting contact");
		System.out.println("Enter 4 to search contact");
		System.out.println("Enter 5 to print contacts");
		System.out.println("Enter 6 to quit");
	}
	
	private static void printContcts(){ 
		System.out.println(mobilePhone.getContactList());
	}
}
