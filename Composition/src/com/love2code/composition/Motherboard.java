package com.love2code.composition;

public class Motherboard {

	private String model;
	private String maufacturer;
	private String ramSlots;
	private String cardSlots;
	private String bios;
	
	public Motherboard(String model, String maufacturer, String ramSlots, String cardSlots, String bios) {
		this.model = model;
		this.maufacturer = maufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMaufacturer() {
		return maufacturer;
	}
	public void setMaufacturer(String maufacturer) {
		this.maufacturer = maufacturer;
	}
	public String getRamSlots() {
		return ramSlots;
	}
	public void setRamSlots(String ramSlots) {
		this.ramSlots = ramSlots;
	}
	public String getCardSlots() {
		return cardSlots;
	}
	public void setCardSlots(String cardSlots) {
		this.cardSlots = cardSlots;
	}
	public String getBios() {
		return bios;
	}
	public void setBios(String bios) {
		this.bios = bios;
	}
	

	
}
