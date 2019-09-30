package com.love2code.composition;

public class Monitor {

	private String model;
	private String manufaturer;
	private String size;
	private Resolution resolution;
	
	public Monitor(String model, String manufaturer, String size, Resolution resolution) {
		super();
		this.model = model;
		this.manufaturer = manufaturer;
		this.size = size;
		this.resolution = resolution;
	}
	
	public void drawPixelAt(int x, int y, String color ){
		System.out.println("Drawing pixel at "+x+", "+y+" co-ordinates in color "+color);
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	

}
