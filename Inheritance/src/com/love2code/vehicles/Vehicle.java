package com.love2code.vehicles;

public class Vehicle {

	private String vehicleName;
	private String vehicleType;

	private int velocity;
	private int direction;

	public Vehicle(String vehicleName, String vehicleType) {
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
	}

	public void steer(int direction) {
		this.direction = direction;
		System.out.println("Steer vehicle in " + this.direction);
	}

	public void move(int speed, int direction) {
		this.velocity = speed;
		this.direction = direction;
		System.out.println("Move vehicle in direction " + this.direction + " at velocity " + this.velocity);
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public void stop(){
		this.velocity=0;
	}

	public int getCurrentVelocity(){
		return this.velocity;
	}
	
	public int getDirection(){
		return this.direction;
	}
}
