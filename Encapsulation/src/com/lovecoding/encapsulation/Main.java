package com.lovecoding.encapsulation;

public class Main {

	public static void main(String[] args) {

		Printer printer=new Printer(100, false);
		
		printer.PrintPages(100);
		
		System.out.println("Catridge level remaining "+printer.getTonerlevel()+"% ..!");

		printer.setTonerlevel(50);
		
		printer.PrintPages(45);
		
		System.out.println("Total number of pages printed "+printer.getNumberOfPagesPrinted());
		
	
	}

}
