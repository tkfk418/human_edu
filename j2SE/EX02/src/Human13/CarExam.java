package Human13;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.speedUp();
		
		Car.driving();
		
		car1.driving();

//		static메서드인 driving은 객체기반으로도 접근 가능하나 권장하지는 않음.
		int sp;
		
	sp = Car.maxSpeed;
		sp = car1.maxSpeed;
//	static 변수인 maxspeed는 클래스를 통해서 접근하는 것을 권장하나
// 객체를 통해서 접근하는 것도 가능하다.
	
	}

}
