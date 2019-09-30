package com.lovecoding.lists;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

	private List<Contact> contactList=new ArrayList<>();
	private Contact contact;
	
	public void store(String contactName, String phoneNumber){
		int index=findContact(contactName);
		if(index<0){
			contactList.add(new Contact(contactName, phoneNumber));
		}else{
			System.out.println("Contact already exists..!");
		}
	}
	
	public void modifyContact(String contactName, String phoneNumber){
		int index=findContact(contactName);
		if(index>=0){
			modifyContact(index, contactName, phoneNumber);
		}else{
			System.out.println("Contact doesn't exists..!");
		}
	}
	
	public List<Contact> getContactList() {
		return contactList;
	}

	public void remove(String contactName){
		int index=findContact(contactName);
		if(index>=0){
			contactList.remove(index);
			System.out.println("Contact successfully removed...!");
		}
	}
	public String search(String contactName){
		
		int index=findContact(contactName);
		if(index>=0)
			return contactList.get(index).toString();
		return "contact doesn't exists...!";
	}
	
	//inner functionality 
	private int findContact(String contactName) {
		//System.out.println("Index of contactName "+contactList.contains(contactName)); 
		for(Contact contact: contactList){
			if(contact.getName().equals(contactName))
				return contactList.indexOf(contact);
		}
		//if(contactList.contains(contactName));
		return -1;
	}
	private void modifyContact(int index, String contactName, String phoneNumber) {
		contact=contactList.get(index);
		contact.setName(contactName);
		contact.setPhoneNumer(phoneNumber);
	}
}
