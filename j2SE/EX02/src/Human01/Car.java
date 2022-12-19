package Human01;

public class Car {
	public String company;	// 제조사.
	public String model;	// 차의 모델.
	public int maxSpeed;	//최고 속도
	public int currentSpeed;	// 차의 현재속도
	public String color; 
	
	public Car() {	// 이 부분이 생략되어 있는 것임. 생성자
		
	}
	
	
	public void speedUP() {
		currentSpeed = currentSpeed+5;
	}
	public void speedDown() {
		currentSpeed = 0;
	}
	

}
