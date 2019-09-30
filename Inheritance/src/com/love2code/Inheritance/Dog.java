package com.love2code.Inheritance;

public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	
	
	public Dog(String name, String size, String weight, int eyes, int legs, int tail, int teeth) {
		super(name, "1", "1", size, weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
	}

	private void chew(){
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() Called");
		chew();
		super.eat();
	}
	
	
}
