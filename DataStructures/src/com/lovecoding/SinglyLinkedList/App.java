package com.lovecoding.SinglyLinkedList;

public class App {
	
	public static void main(String[] args) {
	List<Person> list=new LinkedList<>();
	list.insert(new Person("Sam", 27));
	list.insert(new Person("Thota", 24));
	list.insert(new Person("Gary", 36));
	list.insert(new Person("Sai", 24));
	
	//list.remove(7);
	
	System.out.println(list.size());
	list.traverseList();
	}

	
}
