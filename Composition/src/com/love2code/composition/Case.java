package com.love2code.composition;

public class Case {

	private String model;
	private String manufaturer;
	private String powerSupply;
	private Dimensions dimensions;
	
	public Case(String model, String manufaturer, String powerSupply, Dimensions dimensions) {
		this.model = model;
		this.manufaturer = manufaturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton(){
		System.out.println("power button pressed...!");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufaturer() {
		return manufaturer;
	}
	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	
	
}
