package com.love2code.composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions=new Dimensions(50, 50, 45);
		Case pcCase=new Case("XPS", "DELL", "RDX", dimensions);
		
		Monitor monitor=new Monitor("32inch", "BenQ", "32", new Resolution(4096, 2020));
		
		Motherboard motherBoard=new Motherboard("RXJ-10058", "ASUS","4", "6", "V21.20");
		
		PC pc=new PC(pcCase, monitor, motherBoard);
		pc.powerUp();
	}

}
