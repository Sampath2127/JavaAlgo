package com.lovecoding.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

	
	public static void main(String[] args) {
	 LinkedList<String> linkedList=new LinkedList<>();
		
	addInOrder(linkedList, "Hyderabad");
	addInOrder(linkedList, "Secunderabad");
	addInOrder(linkedList, "Goa");
	addInOrder(linkedList, "Delhi");
	addInOrder(linkedList, "Mumbai");
	System.out.println("populated List : "+linkedList);
	printList(linkedList);
		
	}
	private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> linkedIterator=linkedList.listIterator();
		
		while(linkedIterator.hasNext()){
			int compareValue=linkedIterator.next().compareTo(newCity);
			if(compareValue==0){
				System.out.println(newCity+" already exists...!");
				return false;
			}
			else if(compareValue>0){
				linkedIterator.previous();
				linkedIterator.add(newCity);
				return true;
				
			}else{
				
			}
		}
		linkedIterator.add(newCity);
		return true;
	}

}
