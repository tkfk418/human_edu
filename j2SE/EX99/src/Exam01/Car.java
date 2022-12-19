package Exam01;

public class Car {
	public String company;	
	public String model;	
	public int maxSpeed;	
	public int currentSpeed;	
	
	public Car() {
		
	}
	public Car(String company,String model,int maxSpeed,int currentSpeed) {
		this.company= company;
		this.model = model;
		this.maxSpeed =  maxSpeed;
		this.currentSpeed = currentSpeed;

	}
	public void speedUp() {
		this.currentSpeed = currentSpeed+1;
	
		
	}
	public int speedDown() {
		this.currentSpeed--;
		return this.currentSpeed;
	}
	
	public void turboSpeedUp() {
		
		this.currentSpeed = this.currentSpeed +10;
		}
	

	public int getCurrentSpeed() {
		return this.currentSpeed;
	}
}

