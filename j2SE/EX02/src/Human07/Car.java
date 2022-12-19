package Human07;

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

	} //메소드 오버로딩
	
	public void speedUp() {
//		속도가 1 증가하는 기능
		//this.currentSpeed = currentSpeed+1;
		//car1이 들어와 있는 상황에서는 this = car1을 의미 
		if (this.currentSpeed<this.maxSpeed) {
			this.currentSpeed = currentSpeed+1;
		}
		else {
			System.out.println("최고속도 이상 올리지 못합니다.");
		}
	}
	public void speedUp(int speed) {
		if (this.currentSpeed+speed <this.maxSpeed) {
		this.currentSpeed = this.currentSpeed+speed;
		}		
		else {
			this.currentSpeed = this.maxSpeed;
		}
	}
	
	public int speedDown() {
//		속도가 1 감소하는 기능
		this.currentSpeed--;
		return this.currentSpeed;
	}
	public int speedDown(int speed) {
		this.currentSpeed-=speed;
		return this.currentSpeed;
	}
	
}
