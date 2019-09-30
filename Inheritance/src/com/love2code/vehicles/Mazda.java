package com.love2code.vehicles;


public class Mazda extends Car {

	
	private int roadServiceMonths;

	public Mazda(int roadServiceMonths) {
		super("Mazda6", "sedan", 4, 6, true);
		this.setRoadServiceMonths(roadServiceMonths);
	}
	
	
	public void accelarate(int rate){
		int newVelocity=rate+getCurrentVelocity();
		
		if(newVelocity==0){
			stop();
			changeGear(1);
		}
		else if(newVelocity>=0 && newVelocity<=10){
			changeGear(1);
		}
		else if(newVelocity>=10 && newVelocity<=20){
			changeGear(2);
		}
		else if(newVelocity>=20 && newVelocity<=30){
			changeGear(3);
		}
		else if(newVelocity>=30 && newVelocity<=40){
			changeGear(4);
		}
		else if(newVelocity>=50 && newVelocity<=60){
			changeGear(5);
		}
		else{
			changeGear(6);
		}
	if(newVelocity>0){
		changeVelocity(newVelocity, getDirection());
	}
	}


	public int getRoadServiceMonths() {
		return roadServiceMonths;
	}


	public void setRoadServiceMonths(int roadServiceMonths) {
		this.roadServiceMonths = roadServiceMonths;
	}
}
