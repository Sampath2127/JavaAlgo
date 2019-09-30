package com.lovecoding.encapsulation;

public class Printer {

	private double tonerlevel;
	private double numberOfPagesPrinted;
	private boolean duplexPrinter;
	
	public Printer(double tonerlevel, boolean duplexPrinter) {
		if(this.tonerlevel+tonerlevel<=100 && tonerlevel>-1){
		this.tonerlevel = tonerlevel;
		}
		this.numberOfPagesPrinted = 0;
		this.duplexPrinter = duplexPrinter;
	}

	public double getTonerlevel() {
		return tonerlevel;
	}

	public void setTonerlevel(int tonerlevel) {
		if(this.tonerlevel+tonerlevel<=100 && tonerlevel>-1){
			this.tonerlevel+=tonerlevel;
			System.out.println("Refilled toner to level "+this.tonerlevel+"%");
		}
			
	}

	public double getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
		this.numberOfPagesPrinted+=numberOfPagesPrinted;
	}

	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}

	public void setDuplexPrinter(boolean duplexPrinter) {
		this.duplexPrinter = duplexPrinter;
	}
	
	public void PrintPages(double numOfCopies){
		double numofCopiesToPrint;
		if(this.duplexPrinter){
			numofCopiesToPrint=Math.round((numOfCopies/2)+(numOfCopies%2));
		}else{
			numofCopiesToPrint=numOfCopies;
		}
		this.tonerlevel=getTonerlevel()-numOfCopies;
		if(this.getTonerlevel()<0){
		System.out.println("Please refill toner to continue printing..!");
		}
		else{
		System.out.println("printing "+numofCopiesToPrint+" copies..!");
		this.numberOfPagesPrinted+=numofCopiesToPrint;
		}
	}
	
	
}
