package com.love2code.Inheritance;

public class Animal {

	private String name;
	private String brain;
	private String body;
	private String size;
	private String weight;
	
	public Animal(String name, String brain, String body, String size, String weight) {
		
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	protected void eat(){
		System.out.println("Animal.eat() called...!");
	}
	public void move(){
		
	}
	
	public String getName() {
		return name;
	}

	public String getBrain() {
		return brain;
	}

	public String getBody() {
		return body;
	}

	public String getSize() {
		return size;
	}

	public String getWeight() {
		return weight;
	}
	
	
	
}
