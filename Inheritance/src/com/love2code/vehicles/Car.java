package com.love2code.vehicles;

public class Car extends Vehicle {

	private int numOfWheels;
	private int gears;
	private boolean isAutomaticTransmission;
	private int currentGear;
	public Car(String vehicleName, String vehicleType, int numOfWheels, int gear, boolean isAutomaticTransmission) {
		super(vehicleName, vehicleType);
		this.numOfWheels = numOfWheels;
		this.gears = gear;
		this.isAutomaticTransmission = isAutomaticTransmission;
		this.currentGear=1;
	}
	
	public void changeVelocity(int speed, int direction){
		System.out.println("Car.changeVelocity(): changed to "+speed+" in direction "+direction);
		move(speed, direction);
	}
	
	
	public void changeGear(int currentGear){
		this.currentGear=currentGear;
		System.out.println("gear changed to "+this.currentGear+" gear");
	}


	public int getNumOfWheels() {
		return numOfWheels;
	}


	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}


	public int getGears() {
		return gears;
	}


	public void setGears(int gear) {
		this.gears = gear;
	}


	public boolean isAutomaticTransmission() {
		return isAutomaticTransmission;
	}


	public void setAutomaticTransmission(boolean isAutomaticTransmission) {
		this.isAutomaticTransmission = isAutomaticTransmission;
	}
	
	public void stopCar(){
		stop();
	}
	
}
