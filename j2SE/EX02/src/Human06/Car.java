package Human06;

public class Car {
	public String company;
    public String model;
	public int maxSpeed;
	public int currentSpeed;
	
	public Car(String company,String model,int maxSpeed,int currentSpeed) {
		this.company= company;
		this.model = model;
		this.maxSpeed =  maxSpeed;
		this.currentSpeed = currentSpeed;

	}
	public void speedUp() {
//		속도가 1 증가하는 기능
		this.currentSpeed = currentSpeed+1;
		//car1이 들어와 있는 상황에서는 this = car1을 의미 
		
	}
	public int speedDown() {
//		속도가 1 감소하는 기능
		this.currentSpeed--;
		return this.currentSpeed;
	}
	

	public int getCurrentSpeed() {
		return this.currentSpeed;
	}
}
