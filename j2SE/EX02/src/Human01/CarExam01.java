package Human01;

public class CarExam01 {

	public static void main(String[] args) {
		Car car1 = new Car();		// 객체 또는 인스턴스를 생성
		car1.company = "현대자동차";
		car1.model = "그랜져";
		car1.maxSpeed = 250;
		car1.currentSpeed = 80;
		
		Car car2 = new Car();
		car2.company = "기아자동차";
		car2.model = "K7";
		car2.maxSpeed = 270;
		car2.currentSpeed = 100;
		
		System.out.println (car1);
		System.out.println (car2);
		System.out.println (car1.company);
		System.out.println (car2.company);
		System.out.println (car1.maxSpeed);
		System.out.println (car2.maxSpeed);
		System.out.println (car1.currentSpeed);
		System.out.println (car2.currentSpeed);
		System.out.println ("--------------------");
		car1.speedUP();	//객체지향프로그램에서는 주체(car1)가 늘 붙음
		System.out.println (car1.currentSpeed);
		System.out.println (car2.currentSpeed);
		System.out.println ("--------------------");
		car2.speedUP();
		System.out.println (car1.currentSpeed);
		System.out.println (car2.currentSpeed);
	}

}
