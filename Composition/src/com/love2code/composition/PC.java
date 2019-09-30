package com.love2code.composition;

public class PC {

	private Case pcCase;
	private Monitor monitor;
	private Motherboard motherBoard;
	
	public PC(Case pcCase, Monitor monitor, Motherboard motherBoard) {
		this.pcCase = pcCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
	
	
	public void powerUp(){
		this.pcCase.pressPowerButton();
		this.monitor.drawPixelAt(200, 250, "Blue");
	}
	
	/*private Case getPcCase() {
		return pcCase;
	}
	private Monitor getMonitor() {
		return monitor;
	}
	private Motherboard getMotherBoard() {
		return motherBoard;
	}*/
	
		
}
