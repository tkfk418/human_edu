package Exam01;

public class CarExam {

	
		public static void main(String[] args) {
			Car c3=new Car();
			Car c4=new Car();
			System.out.println(c3);
			System.out.println(c4);
			Car car1 = new Car("현대","그랜져",250,100);
			Car car2 = new Car("기아","K7",200,50);

			System.out.println("car1.currentSpeed==>" + car1.currentSpeed);
			System.out.println("car2.currentSpeed==>" + car2.currentSpeed);
		
			car1.speedUp();
			car2.speedDown();
			
		System.out.println("car1.currentSpeed==>" + car1.currentSpeed);
		System.out.println("car2.currentSpeed==>" + car2.currentSpeed);
			
		car1.turboSpeedUp();
		car2.turboSpeedUp();
		car1.speedDown();
		
		
		int car1CurrentSpeed;
		car1CurrentSpeed = car1.getCurrentSpeed();
		System.out.println("car1currentSpeed==>" + car1CurrentSpeed);
		
		int car2CurrentSpeed;
		car2CurrentSpeed = car2.getCurrentSpeed();
		System.out.println("car2.currentSpeed==>" + car2CurrentSpeed);
		
		
		


	}
	}


